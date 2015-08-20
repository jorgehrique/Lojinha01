package Lojinha.RN;

import Lojinha.DAO.VendasDAOHibernate;
import Lojinha.Entidades.Cliente;
import Lojinha.Entidades.Produto;
import Lojinha.Entidades.Vendas;
import Lojinha.InterfaceDAO.VendasDAO;
import Lojinha.Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;

public class VendasRN {

    private VendasDAO vendasDAO;

    public VendasRN() {
        vendasDAO = new VendasDAOHibernate();
        vendasDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
    }

    public void salvar(Vendas vendas) {
        try {
            vendasDAO.salvar(vendas);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao salvar venda", 2);
        }
    }

    public void atualizar(Vendas vendas) {
        try {
            vendasDAO.atualizar(vendas);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao atualizar venda", 2);
        }
    }

    public void excluir(Vendas vendas) {
        try {
            vendasDAO.excluir(vendas);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao excluir venda", 2);
        }
    }

    public Vendas buscarId(Integer id) {
        Vendas vendas = null;
        try {
            vendas = vendasDAO.buscarId(id);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar vendas", 2);
        }
        return vendas;
    }

    public List<Vendas> listar() {
        List<Vendas> vendas = null;
        try {
            vendas = vendasDAO.listarAtivas();
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao listar vendas", 2);
        }
        return vendas;
    }

    public List<Vendas> listarPorData(String data_venda) {
        List<Vendas> vendas = null;
        try {
            vendas = vendasDAO.listarPorData(data_venda);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar vendas", 2);
        }
        return vendas;
    }

    public List<Vendas> listarPorCliente(Cliente cliente) {
        List<Vendas> vendas = null;
        try {
            vendas = vendasDAO.listarPorCliente(cliente);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar vendas", 2);
        }
        return vendas;
    }

    public List<Vendas> listarPorProduto(Produto produto) {
        List<Vendas> vendas = null;
        try {
            vendas = vendasDAO.listarPorProduto(produto);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar vendas", 2);
        }
        return vendas;
    }
}
