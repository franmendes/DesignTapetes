package designtapetes;

/**
 *
 * @author francielle.ti, eweber
 */
public class FRetangulo extends Forma {
    private double altura;
    private double largura;

    public FRetangulo() {
        super("Retângulo");
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
    
    @Override
    public double calcArea(double largura, double altura){
        return altura * largura;
    }
    
    @Override
    public double calcDimensions(double area){
        return Math.sqrt(area);
    }
    
}
