/*
 * - Atributo que cambia en sus hijos
 * - Metodo que no cambia en sus hijos
 * - Metodo que debe cambiar en sus hijos
 */
package org.patrones.factory.ClaseAbstracta;

/**
 *
 * @author Christian
 */
public abstract class ClaseAbstracta {
    public String nombre;
    
    public void saludar(){
        System.out.println("Hola " + nombre);
    }
    
    public abstract void despedirse();
}
