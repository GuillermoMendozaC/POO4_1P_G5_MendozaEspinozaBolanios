/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class POO4_1P_G5_MendozaEspinozaBolanios {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<String> datos=ManejoArchivos.LeeFichero("vehiculos.txt");
        System.out.println("-------------------------"+datos[1]);
        }
}
