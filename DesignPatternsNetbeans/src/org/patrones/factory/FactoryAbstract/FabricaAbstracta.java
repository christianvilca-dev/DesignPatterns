/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patrones.factory.FactoryAbstract;

import org.patrones.factory.conexion.Conexion;

/**
 *
 * @author Christian
 */
public abstract class FabricaAbstracta {

    public FabricaAbstracta() {
    }
    
    protected abstract Conexion creaConexion(String tipo);
}
