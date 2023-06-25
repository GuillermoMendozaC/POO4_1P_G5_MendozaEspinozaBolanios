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
 * @author User
 */
public class Vehiculo {

    private int duenio;
    private String placa;
    private String marca;
    private String modelo;
    private int año;
    private String chasis;
    private String color;
    
    
    public Vehiculo(int dueño,String placa,String marca,String modelo,int año,String chasis,String color){
        this.duenio=dueño;
        this.placa=placa;
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
        this.chasis=chasis;
        this.color=color;
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

 public boolean equals(Object obj){
        if(this==obj){
            return true;
        }if(obj==null){
            return false;
        }if(getClass()!=obj.getClass()){
            return false;
        }
        Vehiculo otro=(Vehiculo)obj;
        if(this.duenio!=(otro.getDueño())){
            return false;
        }
        
        return true;
    } 
    public String toString(){
        return this.placa;
    }
}

