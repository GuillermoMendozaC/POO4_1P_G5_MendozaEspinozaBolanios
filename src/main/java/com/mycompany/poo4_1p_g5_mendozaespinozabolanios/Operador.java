/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;

/**
 *
 * @author Lenovo
 */
public class Operador extends Usuario {
   private int sueldo;
    
    public Operador(int cedula,String nombre,String apellidos,int edad,String correo,
            String usuario,String contrasenia,TipoUsuario perfil,int sueldo){
        super(cedula,nombre,apellidos,edad,correo,usuario,contrasenia,perfil);
        this.sueldo=sueldo;
    }
    
    
    
    public int getSueldo(){
        return sueldo;
    }
    public void setSueldo(int sueldo){
        this.sueldo=sueldo;
    }
    
    public void consultarmultas(){
        
    
    }
    
    public String toString(){//Prueba para verificar que la lista de operadores contiene la informacion correcta
        return "Sueldo: "+this.sueldo;
    }
    
}
