package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class Cliente extends Usuario {

    private String Num_Tarjeta; //No cambiar a int da error al leer el archivo
    private int Puntos_lic;
    private Vehiculo vehiculo;
    private String usua = "1203864463"; //Variable de ejemplo
    static ArrayList<Cliente> clientes;
    public Cliente(int cedula, String nombre, String apellidos, int edad, String correo, String usuario, String contrasenia, TipoUsuario perfil, String Num_Tarjeta, int Puntos_lic, Vehiculo vehiculo){
        super(cedula,nombre,apellidos,edad,correo,usuario,contrasenia,perfil);
        this.Num_Tarjeta=Num_Tarjeta;
        this.Puntos_lic=Puntos_lic;
        this.vehiculo=vehiculo;
    }
    
    
    public String getNum_Tarjeta() {
        return Num_Tarjeta;
    }

    public void setNum_Tarjeta(String Num_Tarjeta) {
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
    
    //CONSULTAR MULTAS
    @Override
    public void consultarmultas(){
        ArrayList<Multa> multas = PLATAFORMA.multas;
        double saldoPagar=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su cedula o la placa de su vehiculo (si su cedula inicia con 0 omitalo): ");
        String s = sc.nextLine().trim();
        Multa n=null;
        if(s.equals(String.valueOf(this.getCedula()))){
            Vehiculo v =new Vehiculo(Integer.parseInt(s),"f",null,null,0,null,null);
            Cliente c = new Cliente(Integer.parseInt(s),null,null,0,null,null,null,null,null,0,v);
            n= new Multa(c,v,"d",0.0,null,null,0); 
        }
        else if(s.equals(this.getVehiculo().getPlaca())){
            Vehiculo v = new Vehiculo(0,s,null,null,0,null,null);
            Cliente c = new Cliente(0,null,null,0,null,null,null,null,null,0,null);
            n = new Multa(c,v,null,0.0,null,null,0);
        }
        else if(!s.equals(String.valueOf(this.getCedula()))&&!s.equals(this.getVehiculo().getPlaca())){
            System.out.println("La cedula o la placa es incorrecta");
        }
       
        if (!multas.contains(n)){
            System.out.println("Usted no tiene multas");
        }
        else{
            System.out.println("----------------------DETALLE DE MULTAS-----------------------");
            System.out.println("CEDULA | MATRICULA  |  INFRACCION  |  VALOR A PAGAR  |  FECHA DE INFRACCION  |  FECHA DE NOTIFICACION  |  PUNTOS ");
            for(Multa m: multas){
                if(this.getCedula()==m.getCliente().getCedula()){
                     System.out.println(m.getCliente().getCedula()+"|"+m.getVehiculo().getPlaca()+"|"+m.getInfraccion()+"|"+m.getValorMulta()+"|"+m.getFechaInfraccion()+"|"+m.getFechaNotificacion()+"|"+m.getPuntos());
                    saldoPagar+=m.getValorMulta();
            }
        }
        System.out.println("\nVALOR A PAGAR: " + saldoPagar);
        System.out.println("Para PAGAR ACERQUESE A LA AGENCIA MAS CERCANA");
        }
    }

    
    //AGENDAR REVISION
    public void agendarRevision(){
        ArrayList<String> fechas=PLATAFORMA.fechas;
        ArrayList<Multa> multas=PLATAFORMA.multas;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int horario=0;
        int cont=1;
        double base = 150.0;
        double valor_P=0;
        System.out.println("Ingrese placa: ");
        String placa= sc.nextLine();
        if(placa.equals(this.getVehiculo().getPlaca())){
            Multa n = new Multa(this,this.getVehiculo(),"",0.0,"","",0);
            if(!multas.contains(n)){
                System.out.println("Usted no tiene multas");
                System.out.println("---- HORARIOS DISPONIBLES----");
                for(String F : fechas){
                    System.out.println(cont + ". "+F);
                    cont++;
                }
                System.out.println("Escoga horario: ");
                horario=sc.nextInt();
                if(this.getPerfil().equals(TipoUsuario.E)){
                    valor_P= base*0.8;
                }
                else{
                    valor_P=base+((30-this.Puntos_lic)*10);
                    
                }
            System.out.println(this.getNombre()+" "+this.getApellido()+"se ha agendado su cita para el "+fechas.get(horario-1).split(" ")[0]+"a las " + fechas.get(horario-1).split(" ")[1]+
                    "\nValor a pagar: "+valor_P);
            System.out.println("Puede pagar su cita hasta 24 horas antes de la cita.\nDe lo contrario la cita se cancelara");
           
            int cita_Code= r.nextInt(1000, 10000);
            
            ManejoArchivos.EscribirArchivo("AgendaRevisiones.txt",cita_Code + "," + this.getCedula()+","+placa+","+fechas.get(horario-1).split(" ")[0]);
            fechas.remove(horario-1);
            }
            
        
            else{
                System.out.println("Usted tiene multas no puede agendar citas");
            }
        }
    }
    
    
    
    
    


    //----------------------------------------------------------------------------------------------------------------------------------------------
    @Override
        public String toString(){//Prueba para verificar que la lista de clientes contiene la informacion correcta
            return "Edad: " + this.getEdad();
        }
}

  