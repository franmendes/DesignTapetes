package designtapetes;

/**
 *
 * @author francielle.ti
 */
public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio, double area) {
        super(area);
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    
    
    
    
}
