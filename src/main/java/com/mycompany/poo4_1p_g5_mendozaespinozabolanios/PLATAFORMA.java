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
 static ArrayList<Cliente> clientes;
 static ArrayList<Vehiculo> vehiculos;
 static ArrayList<Operador> operadores;
    public static void main(String[] args){
        multas= new ArrayList<>();
        clientes= new ArrayList<>();
        vehiculos= new ArrayList<>();
        operadores= new ArrayList<>();
        
        //CARGA DE LA INFORMACION DE LOS ARCHIVOS
        vehiculos=Vehiculo.cargarVehiculo(vehiculos);
        cargarUsuario();
        multas=Multa.cargarMultas(multas); 
        
        //PRUEBA CONSULTAR MULTA
        Cliente p = clientes.get(0);
        p.consultarmultas();
    }
   
    
    
    
    
    public void validarUsuario(String usuario, String contrasenia){
        
     }
    public void iniciarSesion(String usuario, String contrasenia){
        validarUsuario(usuario,contrasenia);
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    static void cargarUsuario(){
        ArrayList<String> datos=ManejoArchivos.LeeFichero("usuarios.txt");
        ArrayList<String> datos2=ManejoArchivos.LeeFichero("clientes.txt");
        ArrayList<String> datos3=ManejoArchivos.LeeFichero("operadores.txt");

        for(String line:datos){//Lee archivo de usuarios
            Cliente c= null;
            Operador p=null;
            String[] elem=line.trim().split(",");
             String[] nombres= elem[1].split(" ");
             String nombre = nombres[0];
             String apellido= nombres[1];
             int cedula=Integer.parseInt(elem[0]);
             if(TipoUsuario.O.equals(TipoUsuario.valueOf(elem[6]))){//Valida si el usuario es un operador o cliente
                for(String line3:datos3){
                    String[] elem3=line3.trim().split(",");
                    if(Integer.parseInt(elem3[0])==cedula){
                    p = new Operador(cedula,nombre,apellido,Integer.parseInt(elem[2]),
                    elem[3],elem[4],elem[5],TipoUsuario.valueOf(elem[6]),Integer.parseInt(elem3[1]));
                    operadores.add(p);
                    }
                }

            }
            else{
                 //el usuario es un cliente entonces lee el archivo de clientes
                Vehiculo v=null;
                for(String line2:datos2){
                String[] elem2=line2.trim().split(",");
                    for(int i=0;i<vehiculos.size();i++){//busca el vehiculo del cliente.
                    if (vehiculos.get(i).getDueño()==cedula){
                     v = vehiculos.get(i);
                    }
                    }

                 c = new Cliente(cedula,nombre,apellido,Integer.parseInt(elem[2]),
                    elem[3],elem[4],elem[5],TipoUsuario.valueOf(elem[6]),elem2[1],Integer.parseInt(elem2[2]),v);
            }
                clientes.add(c);
           }
        }
    }
        
       
} 
        

