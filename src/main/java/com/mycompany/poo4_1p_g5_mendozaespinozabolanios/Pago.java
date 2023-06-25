/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo4_1p_g5_mendozaespinozabolanios;

/**
 *
 * @author User
 */
public class Pago {
    private int codigopago;
    private Cliente cliente;
    private Double valorpagar;
    private TipoPago  metodopago;
    private Double valorfinalp;
    private String razonpago;
    
    public Pago(){};
    public int getCodigopago() {
        return codigopago;
    }

    public void setCodigopago(int codigopago) {
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
    
    
    
    
}
