package designtapetes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author eweber
 */
public class TabelaPedido extends AbstractTableModel{

    private final String[] colunas = new String[]{"Forma", "Material", "Tamanho", "Preço"};

    private List<Tapete> lista = new ArrayList();
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column != 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tapete carpet = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return carpet.getForma().getNome();
            case 1: return carpet.getMaterial().getTipoMaterial();
            case 2: return carpet.getForma().getArea();
            case 3: return carpet.calcPreco();
            default : return null;
        }
    }

    public void adicionaTapete(Tapete carpet) {
        this.lista.add(carpet);
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);
    }
    
    public boolean removeTapete(Tapete carpet) {
        int linha = this.lista.indexOf(carpet);
        boolean result = this.lista.remove(carpet);
        this.fireTableRowsDeleted(linha,linha);
        return result;
    }

    public void atualizarTabela(List<Tapete> lista){
        this.lista = new ArrayList();
        this.lista.addAll(lista);
        this.fireTableDataChanged();
    }

    public void limpaTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);
    }

    public Tapete getTapete(int linha){
        return lista.get(linha);
    }    
}