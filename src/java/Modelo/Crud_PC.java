/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.SQLException;

/**
 *
 * @author fieldguitar
 */
public class Crud_PC { 
    
    Conexion con;
    String instruccion;
    
    public void AniadirPersona(String Nombre, String E_mail, String Telefono, int Codigo)
    {
        Persona cliente = new Persona(Nombre, E_mail, Telefono, Codigo);
        try {
            con = new Conexion();
            instruccion = "insert into Cliente(Nombre,E_mail,Telefono) values (?,?,?)";
            con.stm = con.getConex().prepareStatement(instruccion);
            con.stm.setString(1, cliente.getNombre());
            con.stm.setString(2, cliente.getNombre());
            con.stm.setString(3, cliente.getNombre());
            con.stm.execute();
            con.getConex().close();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
    }
    
    public void EliminarPersona(int Codigo)
    {
        try {
            con = new Conexion();
            instruccion = "delete from Cliente where Codigo = " + Codigo;
            con.stm = con.getConex().prepareStatement(instruccion);
            con.stm.execute();
            con.getConex().close();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
    }
    
    public void MostrarPersona()
    {
        
    }
}
