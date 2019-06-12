package designtapetes;
/**
 *
 * @author francielle.ti, eweber
 */

public abstract class Forma {
    private String formaNome;
    private double area;

    public Forma(String nome) {
        this.formaNome = nome;
    }
    
    public String getNome(){
        return this.formaNome;
    }
    
    public void setNome(String nome){
        this.formaNome = nome;
    }
    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public abstract double calcDimensions(double area);
}
