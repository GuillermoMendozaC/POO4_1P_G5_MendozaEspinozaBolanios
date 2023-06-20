/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;

/**
 *
 * @author Lenovo
 */
public class Usuario {
    private int cedula;
    private String nombre;
    private String apellidos;
    private String edad;
    private String correo;
    private String usuario;
    private String contrasenia;
    private TipoUsuario perfil;
    
    public String ConsultarMultas(int cedula, Vehiculo vehiculo, ArrayList<Multas> listamultas){
        String multa=null;
        if (cedula!=0){
            for (int i=0;i<listamultas.length;i++){
                for (int j=0;j<listamultas[i].lenght;i++){
                    if (listamultas[i][0]==cedula){
                    multa= listamultas[i][2];
                    }
                }
            }
        }
        else{
            for (int i=0;i<listamultas.length;i++){
                for (int j=0;j<listamultas[i].lenght;i++){
                    if (listamultas[i][1].equals(vehiculo.getPlaca())){
                    multa= listamultas[i][2];
                    }
                }
            }
        
        }
        return multa;
    }
}

