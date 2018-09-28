/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patrones.factory.interfaces;

/**
 *
 * @author Christian
 */
public class Hereda implements Interface{
    public Hereda(){
        saludar();
    }

    @Override
    public void saludar() {
        System.out.println("Hola " + getNombre());
    }

    @Override
    public String getNombre() {
        return miNombre;
    }
    
    public static void main(String[] args) {
        Hereda hereda = new Hereda();
    }
}
