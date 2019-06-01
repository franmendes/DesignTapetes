package designtapetes;

/**
 *
 * @author eweber
 */
public class Material {
    private double precoPorArea;
    private String tipoMaterial;
    
    public Material(String tipoMaterial){
        this.tipoMaterial = tipoMaterial;
    }
    
    public Material(double precoPorArea, String tipoMaterial){
        this.precoPorArea = precoPorArea;
        this.tipoMaterial = tipoMaterial;
    }
    
    public double getPrecoPorArea(){
        return this.precoPorArea;
    }
    
    public void setPrecoPorArea(double precoPorArea){
        this.precoPorArea = precoPorArea;
    }
    
    public String getTipoMaterial(){
        return this.tipoMaterial;
    }
    
    public void setTipoMaterial(String tipoMaterial){
        this.tipoMaterial = tipoMaterial;
    }
}
