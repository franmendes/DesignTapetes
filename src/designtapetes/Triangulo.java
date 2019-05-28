package designtapetes;

/**
 *
 * @author francielle.ti
 */
public class Triangulo extends Forma {
    private double altura;
    private double base;

    public Triangulo(double altura, double base, double area) {
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
    
    
    
}
