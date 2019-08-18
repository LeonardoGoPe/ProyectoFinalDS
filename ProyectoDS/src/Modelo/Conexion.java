/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Leonardo Gomez
 */
public class Conexion {
    private Connection conn;
    private String driver = "com.mysql.jdbc.Driver";
    private String user = "root";
    private String password = "123456";
    private String url = "jdbc:mysql://localhost:3306/DBFinalDS";
    private ResultSet rs;
    private Statement sql;
    
    public Conexion(){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Conexion establecida...");
                sql = (Statement) conn.createStatement();
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar "+e);
        }
    }
    
    public Connection getConnection(){
        return conn;
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
