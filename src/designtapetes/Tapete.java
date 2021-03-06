package designtapetes;

/**
 *
 * @author francielle.ti, eweber
 */
public final class Tapete {
    private Material material;
    private Forma forma;
    private double preco;

    public Tapete(Material material, Forma forma) {
        this.material = material;
        this.forma = forma;
        this.preco = this.calcPreco();
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void setPreco(){
        this.preco = calcPreco();
    }
    
    public double calcPreco(){
        return this.forma.getArea() * this.material.getPrecoPorArea();
    }
    
}
