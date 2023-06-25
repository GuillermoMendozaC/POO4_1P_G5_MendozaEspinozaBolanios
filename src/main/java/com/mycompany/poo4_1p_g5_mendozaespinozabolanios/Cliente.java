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

    private String Num_Tarjeta;
    private int Puntos_lic;
    private Vehiculo vehiculo;
    private String usua = "1203864463";
    
    public Cliente(int cedula, String nombre, String apellidos, int edad, String correo, String usuario, String contrasenia, TipoUsuario perfil, String Num_Tarjeta, int Puntos_lic, Vehiculo vehiculo){
        super(cedula,nombre,apellidos,edad,correo,usuario,contrasenia,perfil);
        this.Num_Tarjeta=Num_Tarjeta;
        this.Puntos_lic=Puntos_lic;
        this.vehiculo=vehiculo;
    }
    
    
    public String getNum_Tarjeta() {
        return Num_Tarjeta;
    }

    public void setNum_Tarjeta(String Num_Tarjeta) {
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

   /* public TipoUsuario getTcliente() {
        return tcliente;
    }

    public void setTcliente(TipoUsuario tcliente) {
        this.tcliente = tcliente;
    }*/
//----------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void consultarmultas() {
        ArrayList<String> datos1 = ManejoArchivos.LeeFichero("multas.txt");
        System.out.println("----------------------DETALLE DE MULTAS-----------------------");
        System.out.println("CEDULA | MATRICULA  |  INFRACCION  |  VALOR A PAGAR  |  FECHA DE INFRACCION  |  FECHA DE NOTIFICACION  |  PUNTOS ");
        int valorpagar = 0;
        for (String cadena : datos1) {
            String[] parts = cadena.split(",");
            String cad = parts[0];
            System.out.println("");

            if (cad.equals(usua)) {
                String deuda = parts[3];
                Float conversion = Float.parseFloat(deuda);
                valorpagar += conversion;
                for (String cosa : parts) {

                    System.out.print(cosa + " | ");
                }
            }
        }
        Integer a = valorpagar;
        Float c = a.floatValue();
        System.out.println("\n VALOR A PAGAR: " + c);
        System.out.println("Para PAGAR ACERQUESE A LA AGENCIA MAS CERCANA");

    }

//  
    public String validarUsuario(String usuario, String contrasena) {
    ArrayList<String> linea = ManejoArchivos.LeeFichero("usuarios.txt");
    ArrayList<String> usuarios = new ArrayList<>();
    ArrayList<String> contraseñas = new ArrayList<>();
     ArrayList<String> tiposdeusua = new ArrayList<>();


    for (String cadena : linea) {
        String[] parte = cadena.split(",");
        String usua = parte[4];
        String contra = parte[5];
        String tipousua = parte[6];
        usuarios.add(usua);
        contraseñas.add(contra);
        tiposdeusua.add(tipousua);
                
    }

    for (int i = 0; i < usuarios.size(); i++) {
        if (usuarios.get(i).equals(usuario) && contraseñas.get(i).equals(contrasena)) {
            String tip = tiposdeusua.get(i);
            return tip;
        }
    }
    return null;
}
    //----------------------------------------------------------------------------------------------------------------------------------------------
        public String toString(){
            return "Edad: " + this.getEdad();
        }

    

   
}
