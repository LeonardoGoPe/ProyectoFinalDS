package modelo;

/**
 *
 * @author Leonardo Gomez
 */
public class Gerente extends Empleado{
    private Local local;
    private Bodega bodega;
    
    
    public Gerente(String id, String nombre, String apellido, Local local, String tipoUsuario, String usuario, String clave) {
        super(id, nombre, apellido, local, tipoUsuario, usuario, clave);
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
    
    public void solicitarProductos(Bodega bodega, Local local, Producto producto, int cantidad){
        //Funcionalidad en costruccion
    }
    
    public void asignarPermisos(Empleado empleado){
        empleado.setTipoUsuario("Administrador");
        
    }
}
