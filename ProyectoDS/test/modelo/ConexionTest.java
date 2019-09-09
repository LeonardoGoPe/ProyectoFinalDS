/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class ConexionTest extends TestCase{
    
    public ConexionTest() {
    }
    /**
     * Test of consultarProductosTecladoLocal method, of class Conexion.
     */
    @Test
    public void testConsultarProductosTecladoLocal() throws Exception {
        System.out.println("consultarProductos - Existe el producto TECLADO en el inventario del LOCAL 1");
        int id = 1;
        String tipoEstablecimiento = "LOCAL";
        Conexion instance =Conexion.getConexion();
        
        Producto expResult = new Producto();
        expResult.setId(0);
        expResult.setNombre("TECLADO");
        expResult.setCategoria("COMPUTO");
        expResult.setDescripcion("TECLADO INALAMBRICO");
        expResult.setValor(30);
        expResult.setCantidad(80);
        
        List<Producto> result = instance.consultarProductos(id, tipoEstablecimiento);
        assertEquals(expResult.getNombre(), result.get(0).getNombre());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of consultarProductosMouseLocal method, of class Conexion.
     */
    @Test
    public void testConsultarProductosMouseLocal() throws Exception {
        System.out.println("consultarProductos - Existe el producto MOUSE en el inventario del LOCAL 1");
        int id = 1;
        String tipoEstablecimiento = "LOCAL";
        Conexion instance =Conexion.getConexion() ;
        
        Producto expResult = new Producto();
        expResult.setId(0);
        expResult.setNombre("MOUSE");
        expResult.setCategoria("COMPUTO");
        expResult.setDescripcion("MOUSE HP GAMER");
        expResult.setValor(20);
        expResult.setCantidad(10);
        
        List<Producto> result = instance.consultarProductos(id, tipoEstablecimiento);
        assertEquals(expResult.getNombre(), result.get(6).getNombre());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of consultarProductosParlantesLocal method, of class Conexion.
     */
    @Test
    public void testConsultarProductosParlantesLocal() throws Exception {
        System.out.println("consultarProductos - Existe el producto PARLANTES en el inventario del LOCAL 1");
        int id = 1;
        String tipoEstablecimiento = "LOCAL";
        Conexion instance =Conexion.getConexion();
        
        Producto expResult = new Producto();
        expResult.setId(0);
        expResult.setNombre("PARLANTES");
        expResult.setCategoria("COMPUTO");
        expResult.setDescripcion("PARLANTE COMUN");
        expResult.setValor(30);
        expResult.setCantidad(10);
        
        List<Producto> result = instance.consultarProductos(id, tipoEstablecimiento);
        assertEquals(expResult.getNombre(), result.get(7).getNombre());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of consultarProductosCategoriaSonDeBodega method, of class Conexion.
     */
    @Test
    public void testConsultarProductosCategoriaSonDeBodega() throws Exception {
        System.out.println("consultarProductosCategoria - Los productos seleccionados son de categoria COMPUTO");
        int id = 0;
        String categoria = "COMPUTO";
        String tipoEstablecimiento = "BODEGA";
        Conexion instance =Conexion.getConexion();
        String expResult = "COMPUTO";
        List<Producto> result = instance.consultarProductosCategoria(1, categoria, tipoEstablecimiento);
        result.forEach((p) -> {
            assertEquals(expResult, p.getCategoria());
        }); // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of consultarProductosPrecioParlantes method, of class Conexion.
     */
    @Test
    public void testConsultarProductosPrecioParlantes() throws Exception {
        System.out.println("consultarProductos - Se consulta el precio de PARLANTES");
        int id = 1;
        String tipoEstablecimiento = "LOCAL";
        Conexion instance =Conexion.getConexion();
        
        Producto expResult = new Producto();
        expResult.setId(0);
        expResult.setNombre("PARLANTES");
        expResult.setCategoria("COMPUTO");
        expResult.setDescripcion("PARLANTE COMUN");
        expResult.setValor(10);
        expResult.setCantidad(25);
        
        List<Producto> result = instance.consultarProductos(id, tipoEstablecimiento);
        assertEquals(expResult.getValor(), result.get(7).getValor());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of consultarProductosPrecioHuawei method, of class Conexion.
     */
    @Test
    public void testConsultarProductosPrecioHuawei() throws Exception {
        System.out.println("consultarProductos - Se consulta el precio de un HUAWEI");
        int id = 1;
        String tipoEstablecimiento = "LOCAL";
        Conexion instance =Conexion.getConexion();
        
        Producto expResult = new Producto();
        expResult.setId(0);
        expResult.setNombre("HUAWEI");
        expResult.setCategoria("CELULAR");
        expResult.setDescripcion("GAMA ALTA");
        expResult.setValor(180);
        expResult.setCantidad(30);
        
        List<Producto> result = instance.consultarProductos(id, tipoEstablecimiento);
        assertEquals(expResult.getValor(), result.get(3).getValor());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of consultarProductosPrecioTeclado method, of class Conexion.
     */
    @Test
    public void testConsultarProductosPrecioTeclado() throws Exception {
        System.out.println("consultarProductos - Se consulta el precio de un TECLADO");
        int id = 1;
        String tipoEstablecimiento = "LOCAL";
        Conexion instance =Conexion.getConexion();
        
        Producto expResult = new Producto();
        expResult.setId(0);
        expResult.setNombre("TECLADO");
        expResult.setCategoria("COMPUTO");
        expResult.setDescripcion("TECLADO INALAMBRICO");
        expResult.setValor(30);
        expResult.setCantidad(30);
        
        List<Producto> result = instance.consultarProductos(id, tipoEstablecimiento);
        assertEquals(expResult.getValor(), result.get(0).getValor());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of consultarRepartidor1 method, of class Conexion.
     */
    @Test
    public void testConsultarRepartidor1() throws Exception {
        System.out.println("consultarRepartidor - Se consulta si existe el usuario gsuarez");
        Conexion instance =Conexion.getConexion();
        Repartidor expResult = new Repartidor();
        
        expResult.setId(0);
        expResult.setNombre("Gabrie");
        expResult.setApellido("Suarez");
        expResult.setUsuario("gsuarez");
        expResult.setEstado("LIBRE");
        
        List<Repartidor> result = instance.obtenerRepartidores();
        assertEquals(expResult.getUsuario(), result.get(0).getUsuario());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of consultarRepartidor2 method, of class Conexion.
     */
    @Test
    public void testConsultarRepartidor2() throws Exception {
        System.out.println("consultarRepartidor - Se consulta si existe el usuario psegura");
        Conexion instance =Conexion.getConexion();
        Repartidor expResult = new Repartidor();
        
        expResult.setId(0);
        expResult.setNombre("Pablo");
        expResult.setApellido("Segura");
        expResult.setUsuario("psegura");
        expResult.setEstado("LIBRE");
        
        List<Repartidor> result = instance.obtenerRepartidores();
        assertEquals(expResult.getUsuario(), result.get(4).getUsuario());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of consultarRepartidor2 method, of class Conexion.
     */
    @Test
    public void testConsultarNombreDeUsuario() throws Exception {
        System.out.println("consultarRepartidor3 - Se consulta si existe el usuario fmosquera");
        Conexion instance =Conexion.getConexion();
        Repartidor expResult = new Repartidor();
        
        expResult.setId(0);
        expResult.setNombre("Fernando");
        expResult.setApellido("Mosquera");
        expResult.setUsuario("fmosquera");
        expResult.setEstado("LIBRE");
        
        List<Repartidor> result = instance.obtenerRepartidores();
        assertEquals(expResult.getUsuario(), result.get(1).getUsuario());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
