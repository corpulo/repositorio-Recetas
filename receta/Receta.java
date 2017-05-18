/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta;

/**
 *
 * @author Usuario
 */
public class Receta {
    
    String nombre,ingredientes,preparacion;
    
    public Receta(String nombre){
        this.nombre=nombre;
    }
    public Receta(String nombre, String ingredientes, String preparacion){
        this.nombre=nombre;
        this.ingredientes=ingredientes;
        this.preparacion=preparacion;
    }
}
