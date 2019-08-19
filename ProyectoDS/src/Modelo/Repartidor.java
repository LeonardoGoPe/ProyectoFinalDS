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
public class Repartidor {
    private int numeroEntregas;
    private boolean disponible;
    private String nombre;

    public Repartidor(String nombre, boolean disponible) {
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public int getNumeroEntregas() {
        return numeroEntregas;
    }

    public void setNumeroEntregas(int numeroEntregas) {
        this.numeroEntregas = numeroEntregas;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
