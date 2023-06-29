/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lenovo
 */
public abstract class Usuario {
    private int cedula;
    private String nombre;
    private String apellidos;
    private int edad;
    private String correo;
    private String usuario;
    private String contrasenia;
    private TipoUsuario perfil;
    
    public Usuario(int cedula,String nombre,String apellidos,int edad,String correo,
            String usuario,String contrasenia,TipoUsuario perfil){
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.correo=correo;
        this.usuario=usuario;
        this.contrasenia=contrasenia;
        this.perfil=perfil;
    }
    
    
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public String getApellido() {
        return apellidos;
    }

    public void setCedula(String apellido) {
        this.apellidos = apellido;
    }
     public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
     public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
     public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
     public TipoUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(TipoUsuario perfil) {
        this.perfil = perfil;
    }
    
    
    
// METODO CONSULTAR MULTAS PRUEBA 
    
    public abstract void consultarmultas(); 
    
    
    
    
}