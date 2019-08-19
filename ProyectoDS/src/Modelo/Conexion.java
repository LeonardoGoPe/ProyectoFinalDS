/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Leonardo Gomez
 */
public class Conexion {
    private Connection conn;
    private String driver = "com.mysql.jdbc.Driver";
    private String user = "root";
    private String password = "123456";
    private String url = "jdbc:mysql://localhost/proyectods";
    private ResultSet rs;
    private Statement sql;
   
    public Conexion(){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Conexion establecida...");
                sql = conn.createStatement();
                rs = sql.executeQuery("select * from producto");
                while(rs.next()){
                    System.out.println(rs.getString("ID")+" "+rs.getString("NOMBRE")+" "+rs.getString("DESCRIPCION"));
                }
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar "+e);
        }
    }
    
    public void desconectar(){
        conn = null;
        if(conn == null)
            System.out.println("Desconexión realizada...");
    }
    
    
    public ResultSet getRs() {
        return rs;
    }
    
    public void setRs(String devcode) {
        try {
            rs = getSql().executeQuery(devcode);
        } catch (SQLException e) {
        }
    }
    
    public Statement getSql() {
        return sql;
    }
    
    public void consultarProductosLocal(int idLocal) throws SQLException{
        sql = conn.createStatement();
        rs = sql.executeQuery("SELECT * FROM PRODUCTO_LOCAL WHERE ID_LOCAL="+idLocal);
        while(rs.next()){
            System.out.println(rs.getString("ID")+" "+rs.getString("NOMBRE_PRODUCTO")+" "+rs.getString("CANTIDAD"));
        }
    }
    
    public void consultarProductosCategoriaLocal(int idLocal, String categoria) throws SQLException{
        CallableStatement stmt = conn.prepareCall("{CALL FILTRAR_CATEGORIA(?,?)}");
        stmt.setString(1, categoria);
        stmt.setInt(2, idLocal);
        ResultSet resultado = stmt.executeQuery();
        while(resultado.next()){
            System.out.println(resultado.getString("NOMBRE")+" "+resultado.getString("DESCRIPCION")+" "+resultado.getString("CANTIDAD"));
            
        }
    }
    
    
    public ArrayList buscarProductoNombre(String nombre) throws SQLException{
        CallableStatement stmt = conn.prepareCall("{CALL buscarProductoNombre(?)}");
        stmt.setString(1, nombre);
        ResultSet resultado = stmt.executeQuery();
        ArrayList lista = new ArrayList();
        while(resultado.next()){
            lista.add(resultado.getString("ID"));
            lista.add(resultado.getString("NOMBRE"));
            lista.add(resultado.getString("DESCRIPCION"));
            lista.add(resultado.getString("PRECIO"));
            lista.add(resultado.getString("STOCK"));
            lista.add(resultado.getString("CATEGORIA"));
        }
        return lista;
    }
}
