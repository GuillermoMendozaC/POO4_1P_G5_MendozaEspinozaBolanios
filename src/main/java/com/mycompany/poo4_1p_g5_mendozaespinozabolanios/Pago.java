/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;

/**
 * Clase
 *
 * @author Nahin
 */
public class Pago {

    private String codigopago;
    private Cliente cliente;
    private double valorpagar;
    private TipoPago metodopago;
    private double valorfinalp;
    private String razonpago;

    /**
     * Constructor de la clase Pago
     *
     * @param codigopago codigo del pago
     * @param cliente Cedula del cliente
     * @param valorpagar valor del pago primitivo
     * @param metodopago metodo de pago(Efectivo o Tarjeta)
     * @param valorfinalp Valor del pago luego de valdiar si es cliente Estandar
     * o Estrella
     * @param razonpago Razon del pago
     */
    public Pago(String codigopago, Cliente cliente, double valorpagar, TipoPago metodopago, double valorfinalp, String razonpago) {
        this.codigopago = codigopago;
        this.cliente = cliente;
        this.valorpagar = valorpagar;
        this.valorfinalp = valorfinalp;
        this.metodopago = metodopago;
        this.razonpago = razonpago;

    }

    public String getCodigopago() {
        return codigopago;
    }

    public void setCodigopago(String codigopago) {
        this.codigopago = codigopago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getValorpagar() {
        return valorpagar;
    }

    public void setValorpagar(Double valorpagar) {
        this.valorpagar = valorpagar;
    }

    public TipoPago getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(TipoPago metodopago) {
        this.metodopago = metodopago;
    }

    public Double getValorfinalp() {
        return valorfinalp;
    }

    public void setValorfinalp(Double valorfinalp) {
        this.valorfinalp = valorfinalp;
    }

    public String getRazonpago() {
        return razonpago;
    }

    public void setRazonpago(String razonpago) {
        this.razonpago = razonpago;
    }

    @Override
    public String toString() {
        return "Pago: " + this.getCliente() + this.getCodigopago() + this.getMetodopago() + this.getRazonpago() + this.getValorfinalp() + this.getValorpagar();
    }
}
