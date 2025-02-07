/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author fieldguitar
 */
public class Crud_PC {
    
    String Nombre, Email, Telefono;
    int Codigo;
    
    public Crud_PC() {
    }

    public Crud_PC(String Nombre, String Email, String Telefono) {
        this.Nombre = Nombre;
        this.Email = Email;
        this.Telefono = Telefono;
    }

    public Crud_PC(String Nombre, String Email, String Telefono, int Codigo) {
        this.Nombre = Nombre;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
}
