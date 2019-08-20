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
   
        // Librería de MySQL
    public static String driver = "com.mysql.jdbc.Driver";

    // Nombre de la base de datos
    public static String database = "ProyectoDS";

    // Host
    public static String hostname = "127.0.0.1";

    // Puerto
    public static String port = "33061";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    // Nombre de usuario
    public static String user = "root";

    // Clave de usuario
    public static String password = "pass";
    
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
    
    public ArrayList<Producto> consultarProductos(int id, String tipoEstablecimiento) throws SQLException{
        CallableStatement stmt;
        ResultSet resultado = null;
        if(tipoEstablecimiento.equals("LOCAL")){
            stmt = conn.prepareCall("{CALL PRESENTAR_PRODUCTOS_LOCAL(?)}");
            stmt.setInt(1, id);
            resultado = stmt.executeQuery();
        }
        else{
            stmt = conn.prepareCall("{CALL PRESENTAR_PRODUCTOS_BODEGA(?)}");
            stmt.setInt(1, id);
            resultado = stmt.executeQuery();
        }
        ArrayList<Producto> listaProductos = new ArrayList();
        while(resultado.next()){
            Producto p = new Producto();
            p.setId(resultado.getInt("ID"));
            p.setNombre( resultado.getString("NOMBRE"));
            p.setCategoria(resultado.getString("CATEGORIA"));
            p.setDescripcion(resultado.getString("DESCRIPCION"));
            p.setValor(resultado.getDouble("PRECIO"));
            p.setCantidad(resultado.getInt("CANTIDAD"));
            listaProductos.add(p);
        }
        return listaProductos;
    }
    
    public ArrayList<Producto> consultarProductosCategoria(int id, String categoria,String tipoEstablecimiento) throws SQLException{
        CallableStatement stmt;
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
        ArrayList<Producto> listaProductos = new ArrayList();
        while(resultado.next()){
            Producto p = new Producto();
            p.setId(resultado.getInt("ID"));
            p.setNombre( resultado.getString("NOMBRE"));
            p.setCategoria(resultado.getString("CATEGORIA"));
            p.setDescripcion(resultado.getString("DESCRIPCION"));
            p.setValor(resultado.getDouble("PRECIO"));
            p.setCantidad(resultado.getInt("CANTIDAD"));
            listaProductos.add(p);
        }
        return listaProductos;
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
        
        public ArrayList<Repartidor> obtenerRepartidores() throws SQLException{
            CallableStatement stmt = conn.prepareCall("{CALL PRESENTAR_REPARTIDORES()}");
            ResultSet resultado = stmt.executeQuery();
            ArrayList<Repartidor> listaRepartiores= new ArrayList();
            while(resultado.next()){
                Repartidor r = new Repartidor();
                r.setId(resultado.getInt("ID"));
                r.setUsuario(resultado.getString("USUARIO"));
                r.setNombre(resultado.getString("NOMBRE"));
                r.setApellido(resultado.getString("APELLIDO"));
                r.setEstado(resultado.getString("ESTADO"));
                listaRepartiores.add(r);
            }
        return listaRepartiores;
        }
        
        public void actualizarEstadoRepartidor(String usuario, String estado) throws SQLException{
            CallableStatement stmt = conn.prepareCall("{CALL ACTUALIZAR_ESTADO_REPARTIDOR(?,?)}");
            stmt.setString(1, usuario);
            stmt.setString(2, estado);
            stmt.executeQuery();
        }
        
        public void crearEnvio(String usuario, String direccion, String descripcion, String tipoEnvio) throws SQLException{
            CallableStatement stmt = conn.prepareCall("{CALL CREAR_ENVIO(?,?,?,?)}");
            stmt.setString(1, usuario);
            stmt.setString(2, direccion);
            stmt.setString(3, descripcion);
            stmt.setString(4, tipoEnvio);
            stmt.executeQuery();
        }
        
        public void modificarDescripcionEnvio(String usuario, String descripcion) throws SQLException{
            CallableStatement stmt = conn.prepareCall("{CALL MODIFICAR_REPARTIDOR_ENVIO(?,?)}");
            stmt.setString(1, usuario);
            stmt.setString(2, descripcion);
            stmt.executeQuery();
        }
        
        public ArrayList<Envio> reporteEnvios() throws SQLException{
            CallableStatement stmt = conn.prepareCall("{CALL PRESENTAR_REPARTIDOR_ENVIO()}");
            ResultSet resultado = stmt.executeQuery();
            ArrayList<Envio> listaEnvios= new ArrayList();
            while(resultado.next()){
                Envio e = new Envio();
                e.setId(resultado.getInt("ID"));
                e.setUsuario(resultado.getString("USUARIO_ENCARGADO"));
                e.setDireccion(resultado.getString("DIRECCION"));
                e.setDescripcion(resultado.getString("DESCRIPCION"));
                e.setTipoEnvio(resultado.getString("TIPO_ENVIO"));
                listaEnvios.add(e);
            }
        return listaEnvios;
        }
}
