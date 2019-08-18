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
public class Producto {
    private int id;
    private String categoria;
    private String nombre;
    private String descripcion;
    private double valor;

    public Producto(int id, String categoria, String nombre, String descripcion, double valor) {
        this.id = id;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void asignarCategoria(String categoria){
        switch (categoria){
            case "Electromestico":
                setCategoria(categoria);
            
            case "Computo":
                setCategoria(categoria);
                
            case "Accesorios":
                setCategoria(categoria);
                
            default:
                setCategoria("No asignada");
        }     
    }
    
    public void asignarLocal(){
        
    }
}
