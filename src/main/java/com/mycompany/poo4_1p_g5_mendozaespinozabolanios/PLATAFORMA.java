/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class PLATAFORMA {
 static ArrayList<Multa> multas;
    public static void main(String[] args){
        multas= new ArrayList<>();

    }
   
    public void validarUsuario(String usuario, String contrasenia){
        
     }
    public void iniciarSesion(String usuario, String contrasenia){
        validarUsuario(usuario,contrasenia);
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void cargarMultas(){
        ArrayList<String> datos=ManejoArchivos.LeeFichero("multas.txt");
        for(String line:datos){
            String[] elementos= line.trim().split(",");
            Multa m = new Multa(Integer.parseInt(elementos[0]),elementos[1],elementos[2],
                    Integer.parseInt(elementos[3]),elementos[4],elementos[5],
                    Integer.parseInt(elementos[6]));
            multas.add(m);
        }
            
    }
}
