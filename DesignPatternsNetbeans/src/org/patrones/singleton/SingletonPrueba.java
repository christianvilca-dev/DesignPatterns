/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patrones.singleton;

/**
 *
 * @author Christian
 */
public class SingletonPrueba {
    public static void main(String[] args) {
//        Singleton miSingleton = new Singleton(); // no se puede realizar
        Singleton miSingleton = Singleton.obtenerSingleton();
        Singleton miSingleton1 = Singleton.obtenerSingleton();
        Singleton miSingleton2 = Singleton.obtenerSingleton();
        Singleton miSingleton3 = Singleton.obtenerSingleton();
        Singleton miSingleton4 = Singleton.obtenerSingleton();
        Singleton miSingleton5 = Singleton.obtenerSingleton();
        
        miSingleton3.vecesLlamado();
        
        System.out.println("terminado!!");
        
//        Creado solo una vez!!
//        Se ha llamado al mentodo: 6 veces
//        terminado!!
    }
}
