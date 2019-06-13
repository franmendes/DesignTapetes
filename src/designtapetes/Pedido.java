/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designtapetes;

import java.util.Arrays;

/**
 *
 * @author francielle.ti, eweber
 */
public class Pedido {
    private Tapete[] tapetes;
    private Cliente cliente;
    private double total;
    
    public Pedido(Cliente cliente){
        this.cliente = cliente;
    }

    public Pedido(Tapete[] tapetes, Cliente cliente, int total) {
        this.tapetes = tapetes;
        this.cliente = cliente;
        this.total = total;
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

    public void removeTapete(int row){
        if(row == -1){
            return;
        }
        for(int i = row; i < (this.tapetes.length - 1); i++){
            this.tapetes[i].setMaterial(this.tapetes[i+1].getMaterial());
            this.tapetes[i].setForma(this.tapetes[i+1].getForma());
            this.tapetes[i].setPreco(this.tapetes[i+1].getPreco());
        }
        
        Tapete[] aux = Arrays.copyOf(this.tapetes, this.tapetes.length-1);
        this.tapetes = aux.clone();
    }
    
    public void editTapete(int row, Tapete tapete){
        int i = row - 1;
        tapetes[i].setMaterial(tapete.getMaterial());
        tapetes[i].setForma(tapete.getForma());
        tapetes[i].setPreco(tapete.getPreco());
    }
}
