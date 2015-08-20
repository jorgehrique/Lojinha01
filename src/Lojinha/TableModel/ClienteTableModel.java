package Lojinha.TableModel;

import Lojinha.Entidades.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ClienteTableModel extends AbstractTableModel {

    private String[] colunas;
    private List<Cliente> clientes;

    public ClienteTableModel(List<Cliente> c) {
        clientes = c;
        colunas = new String[]{"Id", "Nome", "Telefone", "Cidade", "Rua"};
    }

    @Override
    public String getColumnName(int num) {
        return colunas[num];
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return clientes.get(rowIndex).getId();
            case 1:
                return clientes.get(rowIndex).getNome();
            case 2:
                return clientes.get(rowIndex).getTelefone1();
            case 3:
                return clientes.get(rowIndex).getCidade();
            case 4:
                return clientes.get(rowIndex).getRua();
            default:
                return 0;
        }
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
