/*
 * FACTORY ABSTRACT
 * - Fabrica que crea varias fabricas
 */
package org.patrones.factory.FactoryAbstract;

import java.util.Scanner;
import org.patrones.factory.conexion.Conexion;

/**
 *
 * @author Christian
 */
public class Pagos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FabricaHeredada miFabrica;
        Conexion miConexion;
        
        System.out.println("digite la BD: ");
        String tipo = sc.nextLine();
        
        miFabrica = new FabricaHeredada();
        miConexion = miFabrica.creaConexion(tipo);
        
        String salida = "Esta conectado con: " +
                miConexion.descripcion();
        
        System.out.println(salida);
    }
}
