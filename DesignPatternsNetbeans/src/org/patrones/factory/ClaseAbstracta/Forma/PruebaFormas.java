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
public class PruebaFormas {
    public static void main(String[] args) {
        Forma miForma = new Rectangulo();
        miForma.dibujar();
        miForma.redimensionar();
    }
}
