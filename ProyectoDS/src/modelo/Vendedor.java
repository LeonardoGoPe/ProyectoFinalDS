/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author USER
 */
public class Vendedor extends Empleado{

    public Vendedor(String id, String nombre, String apellido, Local Local, String tipoUsuario, String usuario, String clave) {
        super(id, nombre, apellido, Local, tipoUsuario, usuario, clave);
    }
    
    public void ingresarCliente(Cliente cliente){
        //Funcion en construccion
    }
    
    public void generarVenta(int id, Date fecha){
        //Funcion en construccion
    }
    
    public void generarCotizacion(){
        //Funcion en construccion
    }
    
    public void modificarCliente(Cliente cliente){
        //Funcion en construccion
    }
    
    public void modificarCotizacion(){
        //Funcion en construccion
    }
}
