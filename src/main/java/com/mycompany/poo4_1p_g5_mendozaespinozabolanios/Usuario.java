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
    private String edad;
    private String correo;
    private String usuario;
    private String contrasenia;
    private TipoUsuario perfil;
    
    public String ConsultarMultas(int cedula, Vehiculo vehiculo, ArrayList<Multa> listamultas){
        String multa=null;
        if (cedula!=0){ /*si es distinto de 0 significa que tenemos la cedula y 
                            podemos usarla para encontrar las multas*/
            for (int i=0;i<listamultas.size();i++){
                if (cedula==listamultas.get(0).){
                
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

