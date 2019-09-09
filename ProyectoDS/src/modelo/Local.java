package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author USER
 */
public class Local {
    private int id;
    private String direccion;
    private String telefono;
    private Gerente gerente;
    private List<Vendedor> vendedor;
    private List<Producto> productos;
    private List consulta;
    private Map<Producto,Integer> inventario;
    private Conexion cnx =Conexion.getConexion();
    
    public Local(int id, String direccion) {
        this.id = id;
        this.direccion = direccion;
        this.inventario = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public List<Vendedor> getVendedor() {
        return vendedor;
    }

    public void setVendedor(List<Vendedor> vendedor) {
        this.vendedor = vendedor;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List getConsulta() {
        return consulta;
    }

    public void setConsulta(List consulta) {
        this.consulta = consulta;
    }

    public Map<Producto, Integer> getInventario() {
        return inventario;
    }

    public void setInventario(Map<Producto, Integer> inventario) {
        this.inventario = inventario;
    }
    
    
    public void cambiarGerente(Gerente gerente){
        this.gerente = gerente;
    }
    
    public void agregarProductoInventario(String producto, int cantidad) throws SQLException{
        cnx.agregarProductosLocal(getId(), cantidad, producto);
    }
    
    public void mostrarInventario() throws SQLException{
        cnx.consultarProductos(getId(),"LOCAL");
    }
    
    public void mostrarProductosCategoria(String categoria) throws SQLException{
        cnx.consultarProductosCategoria(getId(), categoria, "LOCAL");
    }
    
    
}
