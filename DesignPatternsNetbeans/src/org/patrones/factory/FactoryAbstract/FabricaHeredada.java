/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.patrones.factory.FactoryAbstract;

import org.patrones.factory.conexion.Conexion;
import org.patrones.factory.conexion.MySqlConexion;
import org.patrones.factory.conexion.OracleConexion;
import org.patrones.factory.conexion.PostgresqlConexion;
import org.patrones.factory.conexion.SqlServerConexion;

/**
 *
 * @author Christian
 */
public class FabricaHeredada extends FabricaAbstracta{

    @Override
    protected Conexion creaConexion(String tipo) {
         if(tipo.equalsIgnoreCase("Oracle")){
            return new OracleConexion();
        } else if (tipo.equalsIgnoreCase("SQLServer")) {
            return new SqlServerConexion();
        } else if (tipo.equalsIgnoreCase("MySql")) {
            return new MySqlConexion();
        } else {
            return new PostgresqlConexion();
        }
    }
    
}
