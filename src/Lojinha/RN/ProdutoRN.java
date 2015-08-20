package Lojinha.RN;

import Lojinha.DAO.ProdutoDAOHibernate;
import Lojinha.Entidades.Produto;
import Lojinha.InterfaceDAO.ProdutoDAO;
import Lojinha.Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoRN {

    ProdutoDAO produtoDAO;

    public ProdutoRN() {
        produtoDAO = new ProdutoDAOHibernate();
        produtoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
    }

    public void salvar(Produto produto) {
        try {
            produtoDAO.salvar(produto);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao salvar produto", 2);
        }
    }

    public void atualizar(Produto produto) {
        try {
            produtoDAO.atualizar(produto);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao atualizar produto", 2);
        }
    }

    public void excluir(Produto produto) {
        try {
            produtoDAO.excluir(produto);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao excluir produto", 2);
        }
    }

    public Produto buscarId(Integer id) {
        Produto produto = null;
        try {
            produto = produtoDAO.buscarId(id);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar produto", 2);
        }
        return produto;
    }

    public Produto buscarIdAtivo(Integer id) {
        Produto produto = null;
        try {
            produto = produtoDAO.buscarId(id);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar produto", 2);
        }
        return produto;
    }

    public List<Produto> buscarNome(String nome) {
        List<Produto> produtos = null;
        try {
            produtos = produtoDAO.buscarNome(nome);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar produtos", 2);
        }
        return produtos;
    }

    public List<Produto> listar() {
        List<Produto> produtos = null;
        try {
            produtos = produtoDAO.listarAtivos();
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar produtos", 2);
        }
        return produtos;
    }

    public List<Produto> buscarPreco(double preco) {
        List<Produto> produtos;
        produtos = produtoDAO.buscarPreco(preco);        
        return produtos;
    }
}
