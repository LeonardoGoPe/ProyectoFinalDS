/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Leonardo Gomez
 */
public class Administrador extends Empleado{
    
    public Administrador(String id, String nombre, String apellido, Local Local, String tipoUsuario, String usuario, String clave) {
        super(id, nombre, apellido, Local, tipoUsuario, usuario, clave);
    }
    
    public void actualizarBD(){
        System.out.println("Funcionalidad en construccion");
    }
    
    public void modificarBD(){
        System.out.println("Funcionalidad en construccion");
    }
    
    public void eliminarLBD(){
        System.out.println("Funcionalidad en construccion");
    }
    
    public void crearBD(){
        System.out.println("Funcionalidad en construccion");
    }
}
