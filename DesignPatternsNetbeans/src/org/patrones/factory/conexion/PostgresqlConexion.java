/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patrones.factory.conexion;

/**
 *
 * @author Christian
 */
public class PostgresqlConexion extends Conexion{

    public PostgresqlConexion() {
    }
    
    
    @Override
    public String descripcion(){
        return "Conexion Postgresql";
    }
}
