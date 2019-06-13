package designtapetes;

/**
 *
 * @author francielle.ti, eweber
 */
public class FTriangulo extends Forma {
    private double altura;
    private double base;

    public FTriangulo() {
        super("Triângulo");
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double calcArea(double base, double altura) {
        return (altura * base) / 3;
    }

    @Override
    public double calcDimensions(double area){
        return Math.sqrt(area * 3);
    }
}
