package Lojinha.TableModel;

import Lojinha.Entidades.Produto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProdutoTableModel extends AbstractTableModel {

    private String[] colunas;
    private List<Produto> produtos;

    public ProdutoTableModel(List<Produto> c) {
        produtos = c;
        colunas = new String[]{"Id", "Nome", "Preco de Venda", "Em estoque"};
    }

    @Override
    public String getColumnName(int num) {
        return colunas[num];
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return produtos.get(rowIndex).getId();
            case 1:
                return produtos.get(rowIndex).getNome();
            case 2:
                return "R$ " + produtos.get(rowIndex).getPrecoVenda();
            case 3:
                return produtos.get(rowIndex).getQuantidade();
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

    public List<Produto> getClientes() {
        return produtos;
    }

    public void setClientes(List<Produto> clientes) {
        this.produtos = clientes;
    }
}
