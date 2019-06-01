package designtapetes;
/**
 *
 * @author francielle.ti, eweber
 */

public abstract class Forma {
    private double area;

    public Forma(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public abstract double calcDimensions(double area);
}
