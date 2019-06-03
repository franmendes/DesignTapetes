/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designtapetes;

/**
 *
 * @author francielle.ti, eweber
 */
public class Pedido {
    private String data;
    private Tapete[] tapetes;
    private Cliente cliente;
    private double total;

    public Pedido(String data, Tapete[] tapetes, Cliente cliente, int total) {
        this.data = data;
        this.tapetes = tapetes;
        this.cliente = cliente;
        this.total = total;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Tapete[] getTapetes() {
        return tapetes;
    }

    public void setTapetes(Tapete[] tapetes) {
        this.tapetes = tapetes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void addTapete(Tapete tapete){
        Tapete[] aux = this.tapetes;
        this.tapetes = new Tapete[(this.tapetes.length) + 1];
        System.arraycopy(aux, 0, this.tapetes, 0, aux.length);
        this.tapetes[aux.length] = tapete;
    }    
}
