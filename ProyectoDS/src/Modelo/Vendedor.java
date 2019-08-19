/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author USER
 */
public class Vendedor extends Empleado{
     private List clientes;
     private Vendedor vendedor;
     private Venta venta;

    public Vendedor(String id, String nombre, String apellido, Modelo.Local Local, String tipoUsuario, String usuario, String clave) {
        super(id, nombre, apellido, Local, tipoUsuario, usuario, clave);
    }
    
    public void ingresarCliente(Cliente cliente){
        System.out.println("Funcionalidad en construccion");
    }
    
    public void generarVenta(int id, Date fecha){
        System.out.println("Funcionalidad en construccion");
    }
    
    public void generarCotizacion(){
        System.out.println("Funcionalidad en construccion");
    }
    
    public void modificarCliente(Cliente cliente){
        System.out.println("Funcionalidad en construccion");
    }
    
    public void modificarCotizacion(Cotizacion cotizacion){
        System.out.println("Funcionalidad en construccion");
    }
}
