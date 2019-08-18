/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author USER
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Date feca = new Date();
        List<Producto> productosCo = new ArrayList();
        Cliente c = new Cliente("123", "Juan", "Alimañana", "287", "Gye", "8732");
        Local l = new Local(0,"Gye");
        Empleado v = new Vendedor("123", "Pepe", "Lavoe", l, "Vendedor", "pelavo", "123");
        Producto p1 = new Producto(0, "Compu", "Teclado", "Teclado modelox", 10.5);
        Producto p2 = new Producto(1, "Compu", "Mouse", "Mouse fx", 5.8);
        Producto p3 = new Producto(2, "Compu", "Monitor", "Monitor LG", 333.9);
        Bodega b1 = new Bodega(0, "Gye");
        Bodega b2 = new Bodega(1, "UIO");
        
        b2.agregarProductoInventario(p3, 10);
        b2.agregarProductoInventario(p2, 20);
        
        b1.agregarProductoInventario(p1, 80);
        b1.agregarProductoInventario(p3, 40);
        
        b2.mostrarInventario();
        b1.mostrarInventario();
        
        productosCo.add(p1);
        productosCo.add(p2);
        productosCo.add(p3);
        
        Cotizacion cot = new Cotizacion(0,feca , c, v, productosCo);
        cot.generarCotizacion(productosCo);
        
        cot.imprimirCotizacion();
        
        
    }
    
}
