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

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    public String consultarProductos(int id, String tipoEstablecimiento) throws SQLException{
        String format = "%1$s %2$40s %3$30s";
        String someLine = "";
        sql = conn.createStatement();
        if(tipoEstablecimiento.equals("LOCAL")){
            rs = sql.executeQuery("SELECT * FROM PRODUCTO_LOCAL WHERE ID_LOCAL="+id);
        }
        else{
            rs = sql.executeQuery("SELECT * FROM PRODUCTO_BODEGA WHERE ID_BODEGA="+id);
        }
        someLine += String.format(format, "ID", "NOMBRE_PRODUCTO","CANTIDAD"+"\n");
        while(rs.next()){
            System.out.println(rs.getString("ID")+" "+rs.getString("NOMBRE_PRODUCTO")+" "+rs.getString("CANTIDAD"));
            someLine += String.format(format, rs.getString("ID"), rs.getString("NOMBRE_PRODUCTO"),rs.getString("CANTIDAD")+"\n");
        }
        return someLine;
    }
    
    public String consultarProductosCategoria(int id, String categoria,String tipoEstablecimiento) throws SQLException{
        CallableStatement stmt;
        String format = "%1$s %2$40s %3$30s";
        String someLine = "";
        if(tipoEstablecimiento.equals("LOCAL")){
            stmt = conn.prepareCall("{CALL FILTRAR_CATEGORIA_LOCAL(?,?)}");
            stmt.setString(1, categoria);
            stmt.setInt(2, id);
        }
        else{
            stmt = conn.prepareCall("{CALL FILTRAR_CATEGORIA_BODEGA(?,?)}");
            stmt.setString(1, categoria);
            stmt.setInt(2, id);
        }
        ResultSet resultado = stmt.executeQuery();
        someLine += String.format(format, "NOMBRE", "DESCRIPCION","CANTIDAD"+"\n");
        while(resultado.next()){
            System.out.println(resultado.getString("NOMBRE")+" "+resultado.getString("DESCRIPCION")+" "+resultado.getString("CANTIDAD"));
            someLine += String.format(format, resultado.getString("NOMBRE"), resultado.getString("DESCRIPCION"),resultado.getString("CANTIDAD")+"\n");
        }
        return someLine;
    }
    
    public void quitarProductoBodega(int id, int nuevaCantidad, String nombreProducto) throws SQLException{
        CallableStatement stmt;
        stmt = conn.prepareCall("{CALL QUITAR_STOCK_BODEGA(?,?,?)}");
        stmt.setInt(1, nuevaCantidad);
        stmt.setInt(2, id);
        stmt.setString(3, nombreProducto);
        stmt.executeQuery();
    }
    
    public void agregarProductosLocal(int id, int nuevaCantidad, String nombreProducto) throws SQLException{
        CallableStatement stmt;
        stmt = conn.prepareCall("{CALL AGREGAR_STOCK_LOCAL(?,?,?)}");
        stmt.setInt(1, nuevaCantidad);
        stmt.setInt(2, id);
        stmt.setString(3, nombreProducto);
        stmt.executeQuery();
    }
    
        public String validarUsuario(String usuario, String clave) throws SQLException{
        CallableStatement stmt = conn.prepareCall("{CALL USUARIOS()}");
        ResultSet resultado = stmt.executeQuery();
        while(resultado.next()){
            if(resultado.getString("USERNAME").equals(usuario) && resultado.getString("CLAVE").equals(clave))
                return resultado.getString("TIPO_USUARIO");
        }
        return "El usuario no existe";
    }
        
        public void cambiarPermisos(String usuario) throws SQLException{
            CallableStatement stmt;
            stmt = conn.prepareCall("{CALL CAMBIAR_PERMISOS(?)}");
            stmt.setString(1, usuario);
            stmt.executeQuery();
        }
}
