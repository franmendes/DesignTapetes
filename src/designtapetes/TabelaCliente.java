package designtapetes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author francielle.ti
 */
public class TabelaCliente extends AbstractTableModel{

    private final String[] colunas = new String[]{"CPF", "Nome", "Sobrenome"};

    private List<Cliente> lista = new ArrayList();
    
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
        Cliente customer = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return customer.getCpf();
            case 1: return customer.getNome();
            case 2: return customer.getSobrenome();
            default : return null;
        }
    }

    public void adicionaContato(Cliente customer) {
        this.lista.add(customer);
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);
    }
    
    public boolean removeContato(Cliente customer) {
        int linha = this.lista.indexOf(customer);
        boolean result = this.lista.remove(customer);
        this.fireTableRowsDeleted(linha,linha);
        return result;
    }

    public void atualizarTabela(List<Cliente> lista){
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

    public Cliente getContato(int linha){
        return lista.get(linha);
    }    
}