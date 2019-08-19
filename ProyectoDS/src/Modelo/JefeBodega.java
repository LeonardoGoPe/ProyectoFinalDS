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
    private List<Repartidor> repartidores;

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
    
    public void crearRutaEntrega(Repartidor repartidor, Local local){
        System.out.println("La entregada sera al local ubicado en: "+local.getDireccion()
        +"a cargo del repartidor: "+repartidor.getNombre());
    }
    
    public void enviarArticulos(Cliente cliente){
        System.out.println(cliente.getDireccion());
    }
    
    public void ingresarRepartidorCola(Repartidor repartidor){
        repartidores.add(repartidor);
    }
    
    public void sacarRepartidorCola(Repartidor repartidor){
        repartidores.remove(repartidor);
    }
    
    public void asignarPermisos(Empleado empleado){
        empleado.setTipoUsuario("Administrador");
    }
}
