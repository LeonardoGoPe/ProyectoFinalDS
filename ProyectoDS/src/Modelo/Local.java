/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
    private Telefono telefono;
    private Gerente gerente;
    private Administrador administrador;
    private List<Vendedor> vendedor;
    private List<Producto> productos;
    private ArrayList consulta;
    private Map<Producto,Integer> inventario;

    public Local(int id, String direccion) {
        this.id = id;
        this.direccion = direccion;
        this.inventario = new HashMap<>();
    }
    
    
    
    public void cambiarAdministrador(Administrador administrador){
        
    }
    
    public void cambiarGerente(Gerente gerente){
        
    }
    
    public boolean agregarProductoInventario(Producto producto, int cantidad){
        for (Producto productoLista : inventario.keySet()) {
            if(productoLista.getId() == producto.getId()){
                inventario.put(producto, inventario.get(producto) + cantidad);
                return true;
            }
        }
        inventario.put(producto, cantidad);
        return true;
    }
    
    public void mostrarInventario(){
        for (Producto producto : inventario.keySet()) {
            System.out.println("Producto: " + producto.getNombre() + " -> Cantidad: " + inventario.get(producto));
        }
    }
    
    public void consultarProductosCategoria(String categoria){
        for (Producto producto : inventario.keySet()) {
            if(producto.getCategoria().equals(categoria)){
                System.out.println("Producto: " + producto.getNombre() + " -> Cantidad: " + inventario.get(producto));
            }
        }
    }
    
    
}
