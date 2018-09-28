/*
 * SINGLETON
 * - Devuelve un unico objeto
 * - Solo puede ser instanciada solo una vez
 */
package org.patrones.clases;

/**
 *
 * @author Christian
 */
public final class Singleton { // "final" solo por una sola vez
    // Unico, privado, no se pueda cambiar y va ser creado la primera vez que sea instanciada la clase
    private static final Singleton singleton = new Singleton();
    
    // Para que no sea instanciada, constructor de tipo privado
    // Por lo que no se puede hacer lo siguiente
    // Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("Creado solo una vez!!");
    }
    
    
    public static Singleton obtenerSingleton(){
        return singleton; // Para devolver el objeto que se creo
    }
}
