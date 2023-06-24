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

    private int dueño;
    private String placa;
    private String modelo;
    private int año;
    private String chasis;
    private String color;

    public int getDueño() {
        return dueño;
    }

    public void setDueño(int dueño) {
        this.dueño = dueño;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

//    public class ManejoArchivos {
//
//        public static ArrayList<String> LeeFichero(String nombrearchivo) {
//            ArrayList<String> lineas = new ArrayList<>();
//            File archivo = null;
//            FileReader fr = null;
//            BufferedReader br = null;
//
//            try {
//                archivo = new File(nombrearchivo);
//                fr = new FileReader(archivo, StandardCharsets.UTF_8);
//                br = new BufferedReader(fr);
//
//                String linea;
//                while ((linea = br.readLine()) != null) {
//                    System.out.println(linea);
//                    lineas.add(linea);
//
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//
//                try {
//                    if (null != fr) {
//                        fr.close();
//                    }
//                } catch (Exception e2) {
//                    e2.printStackTrace();
//                }
//            }
//            return lineas;
//
//        }

    }


