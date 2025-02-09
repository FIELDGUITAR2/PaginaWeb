/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author fieldguitar
 */
public class Crud_PC { 
    
    Conexion con;
    String instruccion;
    
    ArrayList<Persona> Clientes;
    
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
    
    public void MostrarPersonas()
    {
        String Nombre;
        String E_mail;
        String Telefono;
        
        Clientes = new ArrayList<>();
        Persona cliente;
        
        try {
            con = new Conexion();
            con.stm = con.getConex().prepareStatement(instruccion);
            Statement senten = con.getConex().createStatement();
            try (ResultSet resultado = senten.executeQuery(instruccion)) {
                con.stm.execute();
                while(resultado.next())
                {
                    int Codigo = Integer.parseInt(resultado.getString("Codigo"));
                    Nombre = resultado.getString("Nombre");
                    E_mail = resultado.getString("E_mail");
                    Telefono = resultado.getString("Telefono");
                    
                    cliente = new Persona(Nombre, E_mail, Telefono, Codigo);
                    
                    Clientes.add(cliente);
                }
            }
            con.getConex().close();
        } catch (NumberFormatException | SQLException e) {
            System.out.println("Error al capturar clientes: "+e);
        }
    }
}
