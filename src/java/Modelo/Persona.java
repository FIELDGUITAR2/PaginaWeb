/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author fieldguitar
 */
public class Persona {
    
    String Nombre, Email, Telefono;
    int Codigo;

    public Persona() {
    }

    public Persona(String Nombre, String Email, String Telefono, int Codigo) {
        this.Nombre = Nombre;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Codigo = Codigo;
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
