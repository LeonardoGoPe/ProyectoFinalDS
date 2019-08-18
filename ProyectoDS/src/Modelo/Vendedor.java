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
    public void solicitarActualizarDB(){
        
    }
    
    public void ingresarCliente(Cliente cliente){
        
    }
    
    public void generarVenta(int id, Date fecha){
        venta = new Venta(id, fecha,this.vendedor);
    }
    
    public void generarCotizacion(){
        
    }
    
    public void modificarCliente(Cliente cliente){
        
    }
    
    public void modificarCotizacion(Cotizacion cotizacion){
        
    }
}
