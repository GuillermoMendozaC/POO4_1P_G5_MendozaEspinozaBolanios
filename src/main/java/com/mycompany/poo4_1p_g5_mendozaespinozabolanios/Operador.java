/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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

    public void consultarUsuarios(ArrayList<Usuario> datos) {
        ArrayList<Cliente> clientes = PLATAFORMA.clientes;
        ArrayList<Operador> operadores = PLATAFORMA.operadores;
        System.out.println("----------------------------------------------------CONSULTAR USUARIOS-------------------------------------------\n");

//        for (int x = 0; x < datos.size(); x++) {
        for (Usuario usuario : datos) {
            for (int y = 0; y < clientes.size(); y++) {
                Cliente val2 = clientes.get(y);
                if (val2.getCedula() == usuario.getCedula()) {
                    String usua = val2.getUsuario();
                    String contra = val2.getContrasenia();
                    String validacion = val2.validarUsuario(usua, contra);
                    if (validacion.equals("S")) {
                        System.out.println(val2.getApellido() + " " + val2.getNombre() + "  |  " + "CLIENTE ESTRANDAR" + "  |  " + val2.getCedula());
                    } else {
                        System.out.println(val2.getApellido() + " " + val2.getNombre() + "  |  " + "CLIENTE ESTRELLA" + "  |  " + val2.getCedula());

                    }
                }
            }
            for (int y = 0; y < operadores.size(); y++) {
                Operador val2 = operadores.get(y);
                if (val2.getCedula() == usuario.getCedula()) {
                    System.out.println(val2.getApellido() + " " + val2.getNombre() + "  |  " + "OPERADOR" + "  |  " + val2.sueldo);
                }
            }

        }
    }

    public void registrarPagos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de cedula del cliente: ");
        String ced = sc.nextLine();
        System.out.println("QUE DESEA PAGAR?\n1. Multas \n2. Revision  \nElija una opcion: ");
        int op1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Valor a pagar: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        System.out.println("Que metodo de pago va a usar?\n1. Efectivo \n2. Tarjeta de credito  \nElija una opcion: ");
        int op2 = sc.nextInt();
        sc.nextLine();
        double adiciontc = (valor * 0.10) + valor;
        Date today = Calendar.getInstance().getTime();
        String codigo = ced.substring(0, 2) + ced.substring(ced.length() - 2);

        System.out.println("CODIGO--" + codigo);

        if (op2 == 1) {
            if (op1== 1) {

                ManejoArchivos.EscribirArchivo("Pagoprueba.txt", codigo + "," + ced + "," + valor + "," + "E"+","  + valor + "," + today + "," + "Multas");
                System.out.println("1");
            } else {
                ManejoArchivos.EscribirArchivo("Pagoprueba.txt", codigo + "," + ced + "," + valor + "," + "E"+","  + valor + "," + today + "," + "Multas");
                                System.out.println("2");

            }
        }else{
            if (op1== 1) {

                ManejoArchivos.EscribirArchivo("Pagoprueba.txt", codigo + "," + ced + "," + valor + "," + "T"+"," + adiciontc + "," + today + "," + "Revision");
                                System.out.println("3");

            } else {
                ManejoArchivos.EscribirArchivo("Pagoprueba.txt", codigo + "," + ced + "," + valor + "," + "T"+","  + adiciontc + "," + today + "," + "Revision");
                                System.out.println("14");

            }
            
        }
    }

    @Override
    public String toString() {//Prueba para verificar que la lista de operadores contiene la informacion correcta
        return "Sueldo: " + this.sueldo;
    }

}
