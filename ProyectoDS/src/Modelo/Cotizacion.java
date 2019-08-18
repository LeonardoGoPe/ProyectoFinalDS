/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author USER
 */
public class Cotizacion {
    private int id;
    private Date fecha;
    private Cliente cliente;
    private Empleado vendedor;
    private List<Producto> productos;
    private double valor;
    private ArrayList cotizacion = new ArrayList();

    public Cotizacion(int id, Date fecha, Cliente cliente, Empleado vendedor, List<Producto> productos) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.productos = productos;
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

    public void setVendedor(Empleado vendedor) {
        this.vendedor = vendedor;
    }

    public List getProductos() {
        return productos;
    }

    public void setProductos(List productos) {
        this.productos = productos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double consultarTotal(){
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
    
    public void generarCotizacion(List listaProductos){
        cotizacion.add("ID: "+getId());
        cotizacion.add("Fecha: "+getFecha());
        cotizacion.add("Vendedor: "+getVendedor().getNombre()+" "+getVendedor().getApellido());
        cotizacion.add("Cliente: "+getCliente().getNombre()+" "+getCliente().getApellido());
        cotizacion.add("La cotizacion teiene los productos:");
        for (Producto producto : productos) {
            cotizacion.add(producto.getNombre());
            valor += producto.getValor();
        } 
        cotizacion.add("Cuyo valor final es: "+valor);
    }
    
    public void imprimirCotizacion(){
        for(Object informacion: cotizacion){
            System.out.println(informacion);
        }
    }
}
