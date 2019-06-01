package designtapetes;

/**
 *
 * @author francielle.ti, eweber
 */
public class FCirculo extends Forma{
    private double raio;

    public FCirculo(double raio, double area) {
        super(area);
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double caclArea(double raio){
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcDimensions(double area) {
        return Math.sqrt(raio) / Math.PI;
    }

    
    
    
    
}
