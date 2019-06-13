package designtapetes;

/**
 *
 * @author francielle.ti, eweber
 */
public class FCirculo extends Forma{
    
    private double raio;

    public FCirculo() {
        super("Círculo");
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcArea(double raio, double dim2){
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcDimensions(double area) {
        return Math.sqrt(raio) / Math.PI;
    }

    
    
    
    
}
