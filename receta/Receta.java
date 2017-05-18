/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Receta {
    
    private String nombre;
    private ArrayList[] ingredientes;
    private String preparacion;
    
    public Receta(String nombre){
        this.nombre=nombre;
    }
    public Receta(String nombre, ArrayList[] ingredientes, String preparacion){
        this.nombre=nombre;
        this.ingredientes=ingredientes;
        this.preparacion=preparacion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ingredientes
     */
    public ArrayList[] getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(ArrayList[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * @return the preparacion
     */
    public String getPreparacion() {
        return preparacion;
    }

    /**
     * @param preparacion the preparacion to set
     */
    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }
    
}
