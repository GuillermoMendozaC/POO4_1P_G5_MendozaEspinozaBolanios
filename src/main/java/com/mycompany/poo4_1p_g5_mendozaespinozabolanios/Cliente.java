package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;

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
    
        public void Consultarmultas(){
            
        }
                
        
}
