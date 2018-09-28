/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patrones.factory.ClaseAbstracta;

/**
 *
 * @author Christian
 */
public class HeredaAbstracta extends ClaseAbstracta{

    @Override
    public void despedirse() {
        System.out.println("Chao " + super.nombre);
    }
    
    public HeredaAbstracta(){
        darNombre("Christian");
        saludar();
        despedirse();
    }
    
    public void darNombre(String nombre){
        super.nombre= nombre;
    }
    
    public static void main(String[] args) {
        HeredaAbstracta ha = new HeredaAbstracta();
    }
}
