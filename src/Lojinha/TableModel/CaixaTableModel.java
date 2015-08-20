package Lojinha.TableModel;

import Lojinha.Entidades.Caixa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CaixaTableModel extends AbstractTableModel {

    private String[] colunas;
    private List<Caixa> caixa;

    public CaixaTableModel(List<Caixa> caixa) {
        this.caixa = caixa;
        colunas = new String[]{"Id", "Descricao", "Valor", "Data"};
    }

    @Override
    public int getRowCount() {
        return caixa.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int num) {
        return colunas[num];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return caixa.get(rowIndex).getId();
            case 1:
                return caixa.get(rowIndex).getDescricao();
            case 2:
                return "R$ " + caixa.get(rowIndex).getPreco();
            case 3:
                return caixa.get(rowIndex).getData_caixa();
            default:
                return null;
        }
    }

}
