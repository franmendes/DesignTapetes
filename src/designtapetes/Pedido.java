/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designtapetes;

/**
 *
 * @author francielle.ti
 */
public class Pedido {
    private String data;
    private String itens[];
    private String cliente;
    private double total;

    public Pedido(String data, String[] itens, String cliente, int total) {
        this.data = data;
        this.itens = itens;
        this.cliente = cliente;
        this.total = total;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String[] getItens() {
        return itens;
    }

    public void setItens(String[] itens) {
        this.itens = itens;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
    
}
