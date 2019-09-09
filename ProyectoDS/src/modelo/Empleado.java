/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


/**
 *
 * @author Leonardo Gomez
 */
public class Empleado {
    protected String id;
    protected String nombre;
    protected String apellido;
    protected Local local;
    protected String tipoUsuario;
    protected String usuario;
    protected String clave;

    public Empleado(String id, String nombre, String apellido, Local local, String tipoUsuario, String usuario, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.local = local;
        this.tipoUsuario = tipoUsuario;
        this.usuario = usuario;
        this.clave = clave;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
