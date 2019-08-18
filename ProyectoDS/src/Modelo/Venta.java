/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Leonardo Gomez
 */
public class Venta {
    private int id;
    private Date fecha;
    private Cliente cliente;
    private Empleado vendedor;
    private List<Producto> productos;
    private float valor;
    private Conexion conexion = new Conexion();

    public Venta(int id, Date fecha, Empleado vendedor) {
        this.id = id;
        this.fecha = fecha;
        this.vendedor = vendedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List getProductos() {
        return productos;
    }

    public void setProductos(List productos) {
        this.productos = productos;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public void buscarArticulo(String tipoBusqueda, String busqueda) throws SQLException{
        switch(tipoBusqueda){
            case "Nombre":
                for(Object o: buscarNombre("Monitor")){
                    System.out.println(o);
                }
        }
    }
    
    public float consultarTotal(){
        for (Producto producto : productos) {
            valor += producto.getValor();
        } 
        return valor;
    }
    
    public void asignarCliente(Cliente cliente){
        setCliente(cliente);
    }
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    public void formaPago(Venta venta){
        
    }
    
    public ArrayList buscarNombre(String nombre) throws SQLException{
        return conexion.buscarProductoNombre(nombre);
    }
    
}
