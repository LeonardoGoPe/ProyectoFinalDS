/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author USER
 */
public class Bodega {
    private int id;
    private String direccion;
    private Telefono telefono;
    private JefeBodega jefeBodega;
    private List repartidores;
    private Map<Producto,Integer> inventario;
    private Conexion cnx = new Conexion();

    public Bodega(int id, String direccion) {
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

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public JefeBodega getJefeBodega() {
        return jefeBodega;
    }

    public void setJefeBodega(JefeBodega jefeBodega) {
        this.jefeBodega = jefeBodega;
    }

    public List getRepartidores() {
        return repartidores;
    }

    public void setRepartidores(List repartidores) {
        this.repartidores = repartidores;
    }

    public Map<Producto, Integer> getInventario() {
        return inventario;
    }

    public void setInventario(Map<Producto, Integer> inventario) {
        this.inventario = inventario;
    }
    
    public void mostrarProductosCategoria(String categoria) throws SQLException{
        cnx.consultarProductosCategoria(getId(), categoria, "BODEGA");
    }
    
    public void mostrarInventario() throws SQLException{
        cnx.consultarProductos(getId(), "BODEGA");
    }
    
    public void quitarProductoInventario(String producto, int cantidad) throws SQLException{
        cnx.quitarProductoBodega(getId(), cantidad, producto);
    }
    
}
