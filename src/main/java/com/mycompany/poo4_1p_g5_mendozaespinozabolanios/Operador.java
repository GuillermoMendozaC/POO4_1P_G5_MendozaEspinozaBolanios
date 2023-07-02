/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Operador extends Usuario {

    private int sueldo;

    public Operador(int cedula, String nombre, String apellidos, int edad, String correo,
            String usuario, String contrasenia, TipoUsuario perfil, int sueldo) {
        super(cedula, nombre, apellidos, edad, correo, usuario, contrasenia, perfil);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    //--------------------------------------------------------------------
    public void consultarmultas() {
        ArrayList<Multa> multas = PLATAFORMA.multas;
        ArrayList<Cliente> clientes = PLATAFORMA.clientes;
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        System.out.println("----------------------------------------------------CONSULTAR MULTAS-------------------------------------------");
        System.out.print("Ingrese un mes: ");
        Scanner sc = new Scanner(System.in);
        String mes1 = sc.nextLine();
        System.out.println(" ----------------------------------------Conductores multados----------------------------------------");
        System.out.println("CEDULA | MATRICULA  |  INFRACCION  |  VALOR A PAGAR  |  FECHA DE INFRACCION  |  FECHA DE NOTIFICACION  |  PUNTOS ");

        for (int x = 0; x < multas.size(); x++) {
            Multa val1 = multas.get(x);
            Cliente val2 = clientes.get(x);
            String elem = val1.getFechaInfraccion();
            String[] lelem = elem.split("-");
            int mes = Integer.parseInt(lelem[1]);
            if (meses[mes-1].equals(mes1)) {
                System.out.println(val1.getCliente().getApellido() + " " + val1.getCliente().getNombre() + " | " + val1.getVehiculo() + " | " + val1.getInfraccion() + " | " + val1.getValorMulta() + " | " + val1.getFechaInfraccion() + " | " + val1.getFechaNotificacion() + " | " + val1.getPuntos());
            }
            }

        }

        @Override
        public String toString
        
            () {//Prueba para verificar que la lista de operadores contiene la informacion correcta
        return "Sueldo: " + this.sueldo;
        }

    }
