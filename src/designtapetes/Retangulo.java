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
public class Retangulo extends Forma {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura, double area) {
        super(area);
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    
}
