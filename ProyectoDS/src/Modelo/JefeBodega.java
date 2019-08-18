/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author Leonardo Gomez
 */
public class JefeBodega extends Empleado{
    private List envios;
    private List repartidores;

    public JefeBodega(String id, String nombre, String apellido, Local Local, String tipoUsuario, String usuario, String clave) {
        super(id, nombre, apellido, Local, tipoUsuario, usuario, clave);
    }

    

    public List getEnvios() {
        return envios;
    }

    public void setEnvios(List envios) {
        this.envios = envios;
    }

    public List getRepartidores() {
        return repartidores;
    }

    public void setRepartidores(List repartidores) {
        this.repartidores = repartidores;
    }
    
    public void crearRutaEntrega(Repartidor repartidor){
        
    }
    
    public void enviarArticulos(Cliente cliente){
        
    }
    
    public void ingresarRepartidorCola(Repartidor repartidor){
        
    }
    
    public void asignarPermisos(Empleado empleado){
        
    }
}
