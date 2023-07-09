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
import java.util.List;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PLATAFORMA {

    static ArrayList<String> fechas;
    static ArrayList<Multa> multas;
    static ArrayList<Cliente> clientes;
    static ArrayList<Vehiculo> vehiculos;
    static ArrayList<Operador> operadores;
    static ArrayList<Usuario> usuarios;

    static void cargarUsuario() {
        ArrayList<String> datos = ManejoArchivos.LeeFichero("usuarios.txt");
        ArrayList<String> datos2 = ManejoArchivos.LeeFichero("clientes.txt");
        ArrayList<String> datos3 = ManejoArchivos.LeeFichero("operadores.txt");

        for (String line : datos) {//Lee archivo de usuarios
            Cliente c = null;
            Operador p = null;
            String[] elem = line.trim().split(",");
            String[] nombres = elem[1].split(" ");

            String nombre = nombres[0];
            String apellido = nombres[1];

            String tipoUsuario = elem[6].trim();
            int cedula = Integer.parseInt(elem[0]);

            if (TipoUsuario.O.equals(TipoUsuario.valueOf(elem[6]))) {//Valida si el usuario es un operador o cliente
                for (String line3 : datos3) {
                    String[] elem3 = line3.trim().split(",");
                    if (Integer.parseInt(elem3[0]) == cedula) {
                        p = new Operador(cedula, nombre, apellido, Integer.parseInt(elem[2]),
                                elem[3], elem[4], elem[5], TipoUsuario.valueOf(elem[6]), Integer.parseInt(elem3[1]));
                        operadores.add(p);
                        usuarios.add(p);
                    }
                }

            } else {
                //el usuario es un cliente entonces lee el archivo de clientes
                Vehiculo v = null;
                for (String line2 : datos2) {
                    String[] elem2 = line2.trim().split(",");
                    for (int i = 0; i < vehiculos.size(); i++) {//busca el vehiculo del cliente.
                        if (vehiculos.get(i).getDueño() == cedula) {
                            v = vehiculos.get(i);
                        }
                    }

                    c = new Cliente(cedula, nombre, apellido, Integer.parseInt(elem[2]),
                            elem[3], elem[4], elem[5], TipoUsuario.valueOf(elem[6]), elem2[1], Integer.parseInt(elem2[2]), v);

                }
                clientes.add(c);
                usuarios.add(c);

            }

        }

    }

    public static void main(String[] args) {
        multas = new ArrayList<>();
        clientes = new ArrayList<>();
        vehiculos = new ArrayList<>();
        operadores = new ArrayList<>();
        usuarios = new ArrayList<>();
        fechas = new ArrayList<>();
        String[] fecha = {"09-07-2023 9:00", "09-07-2023 9:30", "09-07-2023 10:00",
            "09-07-2023 10:30", "09-07-2023 11:00", "09-07-2023 11:30", "09-07-2023 12:00"};
        for (String F : fecha) {
            fechas.add(F);
        }

//        List<Usuario> usuarios = new ArrayList<>();
        //CARGA DE LA INFORMACION DE LOS ARCHIVOS
        vehiculos = Vehiculo.cargarVehiculo(vehiculos);
         cargarUsuario();
        multas = Multa.cargarMultas(multas);

//
//        //PRUEBA CONSULTAR MULTA
        Cliente p = clientes.get(1);cargarUsuario();
        multas = Multa.cargarMultas(multas);

//

        System.out.println(p.getCedula());
        p.consultarmultas();
//        p.agendarRevision();
//        Operador o1p = operadores.get(2);
//        op.consultarmultas();
        //op.consultarUsuarios(usuarios);
        //op.registrarPagos();

        System.out.println("-----------------------------------------------\n\n            BIENVENIDO AL SISTEMA \n\n-----------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("USUARIO : ");
        String usua1 = sc.nextLine();
        System.out.print("CONTRASEÑA : ");
        String contra1 = sc.nextLine();
        Cliente cli = new Cliente(0, null, null, 0, null, usua1, contra1, null, null, 0, null);//agregado, un cliente con esos datos
        Operador op = new Operador(0, null, null, 0, null, usua1, contra1, null, 0);//agregado, un operador con esos datos

        System.out.println("---------------------------------------------------");
        Usuario u = validarUsuario(usua1, contra1);
        TipoUsuario val = null;
        if (u instanceof Cliente){
            cli = (Cliente) u;
            val = cli.getPerfil();
        }else if( u instanceof Operador){
        op = (Operador) u;
        val  = op.getPerfil();
    }
        
        if (val != null) {
            System.out.println("             Ingreso de sesión exitoso\n---------------------------------------------------\n");

            //______________Empieza el switch, menu______________________________________________________
            switch (val) {
                case O:
                    System.out.println("---------------- Menu de Operador ---------------- \n");

                    System.out.println("1.   Registrar pagos: ");//añadido
                    System.out.println("2.   Consultar multas clientes: ");//añadido
                    System.out.println("3.   Consultar usuarios: ");//añadido 
                    System.out.println(" Ingrese el numero de la opcion que desee: ");
                    String eleccionO = sc.nextLine();
                    switch (eleccionO) {
                        case "1":
                            op.registrarPagos();
                            break;
                        case "2":
                            op.consultarmultas();
                            break;
                        case "3":
                            ArrayList<Usuario> listaUsuarios = null;
                            op.consultarUsuarios(listaUsuarios);//Arraylist de usuarios, del que solo se usa el nombre
                    }//termina switch de eleccion de metodos de cliente
                    break;

                default:
                    System.out.println("---------------- Menu de Cliente  ----------------\n ");

                    System.out.println("1.   Consultar multas: ");//añadido
                    System.out.println("2.   Agendar revision: ");//añadido 
                    System.out.println(" Ingrese el numero de la opcion que desee: ");

                    String eleccionCS = sc.nextLine();
                    switch (eleccionCS) {
                        case "1":
                            cli.consultarmultas();

                            break;
                        case "2":
                            cli.agendarRevision();
                            break;
                    }

                    break;
            }//termina switch de eleccion de metodos de cliente

        } else {
            System.out.println("El usuario o contraseña ingresados son incorrectos.");
        }

    }// termina switch general q muestra el menu

    public static Usuario  validarUsuario(String usuario, String contrasena) {
//        ArrayList<String> linea = ManejoArchivos.LeeFichero("usuarios.txt");
//        ArrayList<String> usuarios = new ArrayList<>();
//        ArrayList<String> contraseñas = new ArrayList<>();
//        ArrayList<String> tiposdeusua = new ArrayList<>();
//        for (String cadena : linea) {
//            String[] parte = cadena.split(",");
//            String usua = parte[4];
//            String contra = parte[5];
//            String tipousua = parte[6];
//            usuarios.add(usua);
//            contraseñas.add(contra);
//            tiposdeusua.add(tipousua);
//
//        }
//
//        for (int i = 0; i < usuarios.size(); i++) {
//            if (usuarios.get(i).equals(usuario) && contraseñas.get(i).equals(contrasena)) {
//               
//                String tip = tiposdeusua.get(i);
//                return usuario.get(i);
//            }
//        }
//        return null;
//        ArrayList<Usuario> usuarios = PLATAFORMA.usuarios;
        for (Usuario u: usuarios) {
            if (u.getContrasenia().equals(contrasena) && u.getUsuario().equals(usuario)) {
                return u;
            }
        }

        return null;
    }

    public void iniciarSesion(String usuario, String contrasenia) {
        validarUsuario(usuario, contrasenia);
    }
}
