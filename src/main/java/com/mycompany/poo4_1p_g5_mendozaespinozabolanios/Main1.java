/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;//añadido por tomas
/**
 *
 * @author Lenovo
 */
public class Main1 {

    public static void main(String[] args) {
        ArrayList<Cliente> c = PLATAFORMA.clientes;
        
        // Lo comento porque cliente tiene constructor ahora por lo que va a dar 
        //error si se prueba en este momento
        
        Scanner sc = new Scanner(System.in);
        //Cliente cli = new Cliente(0, null, null, 0, null, null, null, null, null, 0, null); 

//        cli.Consultarmultas();
        System.out.println("-----------------------------------------------\n\n            BIENVENIDO AL SISTEMA \n\n-----------------------------------------------");

       
        System.out.print("USUARIO : ");
        String usua1 = sc.nextLine();
        System.out.print("CONTRASEÑA : ");
        String contra1 = sc.nextLine();
        
Cliente cli = new Cliente(0, null, null, 0, null, usua1, contra1, null, null, 0, null);//agregado, un cliente con esos datos
Operador op = new Operador(0, null, null,0, null,usua1, contra1, null,0);//agregado, un operador con esos datos


        System.out.println("-----------------------------------------");
        String val = cli.validarUsuario(usua1, contra1);
        if (val != null) {
            System.out.println("Ingreso de sesión exitoso");
            
            //______________Empieza el switch, menu______________________________________________________
            switch (val) {
                case "O":
                    System.out.println("Se presentara un menu de Operador");
                    
                    System.out.println("1.   Registrar pagos: ");//añadido
                    System.out.println("2.   Consultar multas clientes: ");//añadido
                    System.out.println("3.   Consultar usuarios: ");//añadido 
                    String eleccionO = sc.nextLine();
                    switch(eleccionO){
                        case "1":
                            op.registrarPagos();
                            break;
                        case "2":
                            op.consultarmultas();
                            break;
                        case "3":
                            ArrayList<Usuario> listaUsuarios = null;
                            op.consultarUsuarios(listaUsuarios);//Arraylist de usuarios, del que solo se usa el nombre
                    }//termina switch de eleccion de metodos de cliente
                    break;      

                    
                case "E":
                    System.out.println("Se presentara un menu de Cliente pero este es Estrella");
                    
                    System.out.println("1.   Consultar multas: ");//añadido
                    System.out.println("2.   Agendar revision: ");//añadido 
                    String eleccionCE = sc.nextLine();
                    switch(eleccionCE){
                        case "1":
                            cli.consultarmultas();
                            break;
                        case "2":
                            cli.agendarRevision();
                            break; 
                    }//termina switch de eleccion de metodos de cliente
                    break;
                    
                case "S":
                    System.out.println("Se presentara un menu de Cliente Standar");
                    
                    
                    System.out.println("1.   Consultar multas: ");//añadido
                    System.out.println("2.   Agendar revision: ");//añadido 
                    String eleccionCS = sc.nextLine();
                    switch(eleccionCS){
                        case "1":
                            cli.consultarmultas();
                            
                            break;
                        case "2":
                            cli.agendarRevision();
                            break;}

                    break;      
            }//termina switch de eleccion de metodos de cliente
            
        } else {
            System.out.println("valio queso");
        }
            
    }// termina switch general q muestra el menu

    

    
    
}