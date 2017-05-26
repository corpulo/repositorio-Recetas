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
    private ArrayList<String> preparacion;
    private int personas=4;
    private String autor;
    
    public Receta(String nombre){
        this.nombre = nombre;
        this.ingredientes = new ArrayList<Ingrediente>();
        this.preparacion = new ArrayList<String>();
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
    public ArrayList<String> getPreparacion() {
        return preparacion;
    }

    /**
     * @param preparacion the preparacion to set
     */
    public void setPreparacion(ArrayList<String> preparacion) {
        this.preparacion = preparacion;
    }
    
    public void addIngredientes(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
      
    }
       
    public void addPreparacion(String preparacion){
        this.preparacion.add(preparacion);
    }
    
    public String toString(){
        String contenido = "";
        
        contenido += "Recetca: "+this.nombre+"\n";
        contenido += "Ingredientes:\n";
        for(Ingrediente i : ingredientes){
            contenido += "\t"+i+"\n";
        }
        contenido += "Preparación:\n";
        for(int paso = 1; paso <= preparacion.size(); paso++){
            contenido += "\tPaso "+paso+": "+preparacion.get(paso)+"\n";
        }
        
        
        return contenido;
    }

    /**
     * @return the personas
     */
    public int getPersonas() {
        return personas;
    }

    /**
     * @param personas the personas to set
     */
    public void setPersonas(int personas) {
        this.personas = personas;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
}

