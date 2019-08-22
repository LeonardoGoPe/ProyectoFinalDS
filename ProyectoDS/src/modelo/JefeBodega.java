/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Leonardo Gomez
 */
public class JefeBodega extends Empleado{
    private List envios;
    private List<Repartidor> repartidores;

    public JefeBodega(String id, String nombre, String apellido, Local local, String tipoUsuario, String usuario, String clave) {
        super(id, nombre, apellido, local, tipoUsuario, usuario, clave);
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
}
