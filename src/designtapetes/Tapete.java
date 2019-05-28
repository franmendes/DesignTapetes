package designtapetes;

/**
 *
 * @author francielle.ti
 */
public class Tapete {
    private String tecido;
    private String forma;
    private double preco;

    public Tapete(String tecido, String forma, double preco) {
        this.tecido = tecido;
        this.forma = forma;
        this.preco = preco;
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
