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
            if (meses[mes - 1].equals(mes1)) {
                System.out.println(val1.getCliente().getApellido() + " " + val1.getCliente().getNombre() + " | " + val1.getVehiculo() + " | " + val1.getInfraccion() + " | " + val1.getValorMulta() + " | " + val1.getFechaInfraccion() + " | " + val1.getFechaNotificacion() + " | " + val1.getPuntos());
            }
        }

    }

    public void consultarUsuarios() {
        ArrayList<Cliente> clientes = PLATAFORMA.clientes;
        ArrayList<Operador> operadores = PLATAFORMA.operadores;
        ArrayList<String> datos = ManejoArchivos.LeeFichero("usuarios.txt");

        System.out.println("----------------------------------------------------CONSULTAR USUARIOS-------------------------------------------");

        for (int x = 0; x < datos.size(); x++) {
            String lista = datos.get(x);
            String[] elem = lista.split(",");
            int cedula = Integer.parseInt(elem[0]);
            for (int y = 0; y < clientes.size(); y++) {
                Cliente val2 = clientes.get(y);
                if (val2.getCedula() == cedula) {
                    String usua = val2.getUsuario();
                    String contra = val2.getContrasenia();
                    String validacion = val2.validarUsuario(usua, contra);
                    if (validacion.equals("S")) {
                        System.out.println(val2.getApellido() + " " + val2.getNombre() + "  |  " + "CLIENTE ESTRANDAR"+ "  |  " + val2.getCedula());
                    } else {
                        System.out.println(val2.getApellido() + " " + val2.getNombre() + "  |  " + "CLIENTE ESTRELLA"+ "  |  " + val2.getCedula());

                    }
                }
            }
            for (int y = 0; y < operadores.size(); y++) {
                Operador val2 = operadores.get(y);
                if (val2.getCedula() == cedula) {
                    System.out.println(val2.getApellido() + " " + val2.getNombre() + "  |  " + "OPERADOR" + "  |  " + val2.sueldo);
                }
            }

        }
    }

    @Override
    public String toString() {//Prueba para verificar que la lista de operadores contiene la informacion correcta
        return "Sueldo: " + this.sueldo;
    }

}
