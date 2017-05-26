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
    private ArrayList<Ingrediente> ingredientes;
    private String[] preparacion;
    
    public Receta(String nombre,String[] preparacion){
        this.nombre=nombre;
        this.ingredientes= new ArrayList<Ingrediente>();
        this.preparacion=preparacion;
    }
    
    public Receta(String nombre, String[] preparacion, ArrayList<Ingrediente> ingredientes){
        this(nombre, preparacion);
        this.ingredientes = new ArrayList<Ingrediente>();
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
    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * @return the preparacion
     */
    public String[] getPreparacion() {
        return preparacion;
    }

    /**
     * @param preparacion the preparacion to set
     */
    public void setPreparacion(String[] preparacion) {
        this.preparacion = preparacion;
    }
    

    public void addIngredientes(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
      
    }
    
    public void addPreparacion(String preparacion){
    
    }
    
}

