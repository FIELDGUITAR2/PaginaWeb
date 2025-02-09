/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author fieldguitar
 */
public class Conexion {
    
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String bd = "Clientes"; 
    private static String passw = ""; 
    private static String usuario = "root";
    private static String url = "jdbc:mysql://localhost:3306/"+bd;
    
    public Connection conex;
    public PreparedStatement stm;
    
    public Conexion(){
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo crear el puente");
        }
        try {
            conex = DriverManager.getConnection(url,usuario,passw);
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
    }
    
    public Connection getConex() {
        return conex;
    }

    public void setConex(Connection conex) {
        this.conex = conex;
    }

    public PreparedStatement getStm() {
        return stm;
    }

    public void setStm(PreparedStatement stm) {
        this.stm = stm;
    }
    
}
