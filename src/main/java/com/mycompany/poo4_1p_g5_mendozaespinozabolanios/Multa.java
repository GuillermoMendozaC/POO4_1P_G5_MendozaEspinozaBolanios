/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;
<<<<<<< HEAD
=======
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
>>>>>>> 378daa91dd8e707c40be77ce95590569e3e28640

public class Multa {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private String infraccion;
    private int valorMulta;
    private String fechaInfraccion;
    private String fechaNotificacion;
    private int puntos;

<<<<<<< HEAD
=======
    
    public  Multa(Cliente cliente, Vehiculo vehiculo, String infraccion,int valorMulta,
    String fechaInfraccion, String fechaNotificacion,int puntos){
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.infraccion = infraccion;
        this.valorMulta = valorMulta;
        this.fechaInfraccion = fechaInfraccion;
        this.fechaNotificacion = fechaNotificacion;
        this.puntos = puntos;
    }
    public  Multa(int duenio,String plak,String infraccion,int valorMulta,
    String fechaInfraccion, String fechaNotificacion,int puntos){
        int cedula=duenio;
        String placa = plak;
        this.infraccion = infraccion;
        this.valorMulta = valorMulta;
        this.fechaInfraccion = fechaInfraccion;
        this.fechaNotificacion = fechaNotificacion;
        this.puntos = puntos;
        
    }

>>>>>>> 378daa91dd8e707c40be77ce95590569e3e28640
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getInfraccion() {
        return infraccion;
    }

    public void setInfraccion(String infraccion) {
        this.infraccion = infraccion;
    }

    public int getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(int valorMulta) {
        this.valorMulta = valorMulta;
    }

    public String getFechaInfraccion() {
        return fechaInfraccion;
    }

    public void setFechaInfraccion(String fechaInfraccion) {
        this.fechaInfraccion = fechaInfraccion;
    }

    public String getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(String fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
<<<<<<< HEAD
=======
    
>>>>>>> 378daa91dd8e707c40be77ce95590569e3e28640
}
