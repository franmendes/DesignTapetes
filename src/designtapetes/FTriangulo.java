package designtapetes;

/**
 *
 * @author francielle.ti, eweber
 */
public class FTriangulo extends Forma {
    private double altura;
    private double base;

    public FTriangulo(double altura, double base, double area) {
        super(area);
        this.altura = altura;
        this.base = base;
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
    
    public double calcArea(double altura, double base) {
        return (altura * base) / 3;
    }

    @Override
    public double calcDimensions(double area){
        return Math.sqrt(area * 3);
    }
}
