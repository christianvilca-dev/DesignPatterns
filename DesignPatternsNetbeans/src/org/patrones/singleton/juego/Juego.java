/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patrones.singleton.juego;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Juego {
    
    public static void main(String[] args) {
        Marcianos marcianos;
        Computadora computadora;
        Jugador jugador;
        Scanner sc;
        
        marcianos = Marcianos.getMarcianos();
        computadora = new Computadora();
        jugador = new Jugador();
        sc = new Scanner(System.in);
        
        int disparos;
        do {
            System.out.print("Digite los disparos: ");
            disparos= sc.nextInt();
            for (int i = 0; i < disparos; i++) {
                jugador.destruirMarciano(); 
            }
            computadora.creaMarcianos();
            marcianos.cuantosQuedan();
        } while (disparos!=0);
    }
}
