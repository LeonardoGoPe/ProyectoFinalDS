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
public class Gerente extends Empleado{
    private Bodega bodega;
    private Local local;
    
    
    public Gerente(String id, String nombre, String apellido, Local Local, String tipoUsuario, String usuario, String clave) {
        super(id, nombre, apellido, Local, tipoUsuario, usuario, clave);
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public Modelo.Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
    
    public void solicitarProductos(Bodega bodega, Local local){
        
    }
    
    public void solicitarActualizarDB(){
        
    }
    
    public void asignarPermisos(Empleado empleado){
        
    }
}
