/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;

import static com.mycompany.poo4_1p_g5_mendozaespinozabolanios.PLATAFORMA.vehiculos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *Esta clase representara un vehiculo
 * @author Nahin
 */
public class Vehiculo {

    private int duenio;
    private String placa;
    private String marca;
    private String modelo;
    private int año;
    private String chasis;
    private String color;

    /**
     * Constructor del obejto Vehiculo 
     * @param dueño Cedula del dueño del vehiculo
     * @param placa Placa del vehiculo
     * @param marca Marca del vehiculo
     * @param modelo Modelo del vehiculo
     * @param año Año de fabricacion del vahiculo
     * @param chasis Numero de chasis del vehiculo
     * @param color  Color del vehiculo
     */ 
    
    public Vehiculo(int dueño, String placa, String marca, String modelo, int año, String chasis, String color) {
        this.duenio = dueño;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.chasis = chasis;
        this.color = color;
    }

    public int getDueño() {
        return duenio;
    }

    public void setDueño(int dueño) {
        this.duenio = dueño;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Vehiculo otro = (Vehiculo) obj;
        if (!this.getPlaca().equals(otro.getPlaca())) {
            return false;
        }

        return true;
    }
/**
 * Se carga la informacion de el archivo "Vehiculo.txt" en el Arraylist vehiculos
 * @param vehiculos Arraylist de Vehiculos 
 * @return Arraylist de Vehiculos
 */
    static ArrayList<Vehiculo> cargarVehiculo(ArrayList<Vehiculo> vehiculos) {
        ArrayList<String> datos = ManejoArchivos.LeeFichero("vehiculos.txt");
        //Se recorre cada linea del archivo y se va agregando cada objeto en el Arraylist
        for (String line : datos) {
            String[] elementos = line.trim().split(",");
            Vehiculo v = new Vehiculo(Integer.parseInt(elementos[0]), elementos[1], elementos[2],
                    elementos[3], Integer.parseInt(elementos[4]), elementos[5], elementos[6]);
            vehiculos.add(v);
        }
        return vehiculos;
    }
    
    
    public String toString() {
        return this.placa;
    }
}
