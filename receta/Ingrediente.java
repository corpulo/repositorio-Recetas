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
public class Ingrediente {
    private float cantidad;
    private String unidad;
    private String nombre;
    
    public Ingrediente(float cantidad,String unidad, String nombre){
        this.cantidad=cantidad;
        this.unidad=unidad;
        this.nombre=nombre;
    }
    
    public Ingrediente(String nombre){
        this.nombre=nombre;
    }

    /**
     * @return the cantidad
     */
    public float getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
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
     * @return the unidad
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    public String toString(){
        return this.getCantidad()+this.getUnidad()+" de "+this.getNombre();
    }
}
