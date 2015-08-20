package Lojinha.TableModel;

import Lojinha.Entidades.Vendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VendasTableModel extends AbstractTableModel {

    private List<Vendas> vendas;
    private String[] colunas;

    public VendasTableModel(List<Vendas> vendas) {
        colunas = new String[]{"Id", "Produto", "Cliente", "Qtd", "Data", "Pago"};
        this.vendas = vendas;
    }

    @Override
    public int getRowCount() {
        return vendas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return vendas.get(rowIndex).getId();
            case 1:
                return vendas.get(rowIndex).getProduto().getNome();
            case 2:
                return vendas.get(rowIndex).getCliente().getNome();
            case 3:
                return vendas.get(rowIndex).getQuantidade();
            case 4:
                return vendas.get(rowIndex).getDataVenda();
            case 5:
                if (vendas.get(rowIndex).isPago()) {
                    return "Sim";
                } else {
                    return "Não";
                }
            default:
                return 0;
        }
    }
}
