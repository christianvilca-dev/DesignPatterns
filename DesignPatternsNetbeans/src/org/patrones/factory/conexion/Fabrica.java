/*
 * FACTORY
 * -  Crea objetos en momento de ejecucion
 */
package org.patrones.factory.conexion;

/**
 *
 * @author Christian
 */
public class Fabrica {
    // Nombre del tipo de conexion
    protected String tipo;

    // Constructor que recibe el nombre del tipo de conexion
    public Fabrica(String t) {
        tipo = t;
    }
    
    // Metodo que retorna el objeto de conexion especifico
    public Conexion creaConexion(){
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
