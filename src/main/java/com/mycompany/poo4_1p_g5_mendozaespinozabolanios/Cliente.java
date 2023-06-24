package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class Cliente extends Usuario {

    private int Num_Tarjeta;
    private int Puntos_lic;
    private Vehiculo vehiculo;
    private TipoUsuario tcliente;
    private String usua = "1203864463";

    public int getNum_Tarjeta() {
        return Num_Tarjeta;
    }

    public void setNum_Tarjeta(int Num_Tarjeta) {
        this.Num_Tarjeta = Num_Tarjeta;
    }

    public int getPuntos_lic() {
        return Puntos_lic;
    }

    public void setPuntos_lic(int Puntos_lic) {
        this.Puntos_lic = Puntos_lic;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public TipoUsuario getTcliente() {
        return tcliente;
    }

    public void setTcliente(TipoUsuario tcliente) {
        this.tcliente = tcliente;
    }

   
        
        public void Consultarmultas() {
            ArrayList<String> datos1 = ManejoArchivos.LeeFichero("multas.txt");
//            System.out.println("Multas: ");
                System.out.println("----------------------DETALLE DE MULTAS-----------------------");
                System.out.println("CEDULA | MATRICULA  |  INFRACCION  |  VALOR A PAGAR  |  FECHA DE INFRACCION  |  FECHA DE NOTIFICACION  |  PUNTOS ");
                for(String cadena :datos1) {      
//                    System.out.println("--"+((Object)cadena).getClass().getSimpleName());
                    String[] parts = cadena.split(",");
                    String cad = parts[0];
                    System.out.println("");
                    if (cad.equals(usua)){
                        for (String cosa:parts){
                        System.out.print(cosa+" | ");
                    }
                }
                    
                    

//                    cadena.split(",");
                    
        }
    }
}

