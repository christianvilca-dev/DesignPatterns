/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patrones.factory.ClaseAbstracta.Forma;

/**
 *
 * @author Christian
 */
public class Rectangulo extends Forma{

    public Rectangulo() {
        mover(5,8);
        dondeEstoy();
    }

    @Override
    protected void dibujar() {
        System.out.println("Estoy dibujando un Rectangulo");
    }

    @Override
    protected void redimensionar() {
        System.out.println("Estoy siendo mas grande");
    }
}
