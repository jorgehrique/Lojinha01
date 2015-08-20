package Lojinha.DAO;

import Lojinha.Entidades.Produto;
import Lojinha.InterfaceDAO.ProdutoDAO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class ProdutoDAOHibernate implements ProdutoDAO {

    private Transaction transacao;
    private Session sessao;

    @Override
    public void setSession(Session sessao) {
        this.sessao = sessao;
    }

    @Override
    public void salvar(Produto produto) {
        transacao = sessao.beginTransaction();
        sessao.save(produto);
        transacao.commit();
    }

    @Override
    public void atualizar(Produto produto) {
        transacao = sessao.beginTransaction();
        sessao.update(produto);
        transacao.commit();
    }

    @Override
    public void excluir(Produto produto) {
        transacao = sessao.beginTransaction();
        sessao.delete(produto);
        transacao.commit();
    }

    @Override
    public Produto buscarId(int id) {
        Produto produto;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Produto.class);
        produto = (Produto) filtro.add(Restrictions.eq("id", id)).uniqueResult();
        transacao.commit();
        return produto;
    }

    @Override
    public Produto buscarIdAtivo(int id) {
        Produto produto;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Produto.class)
                .add(Restrictions.eq("status", true));
        produto = (Produto) filtro.add(Restrictions.eq("id", id)).uniqueResult();
        transacao.commit();
        return produto;
    }

    @Override
    public List<Produto> buscarNome(String nome) {
        List<Produto> produtos;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Produto.class)
                .add(Restrictions.eq("status", true));
        filtro.addOrder(Order.asc("nome"));
        produtos = filtro.add(Restrictions.like("nome", "%" + nome + "%")).list();
        transacao.commit();
        return produtos;
    }

    @Override
    public List<Produto> listar() {
        List<Produto> produtos;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Produto.class);
        filtro.addOrder(Order.asc("nome"));
        produtos = filtro.list();
        transacao.commit();
        return produtos;
    }

    @Override
    public List<Produto> listarAtivos() {
        List<Produto> produtos;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Produto.class);
        filtro.addOrder(Order.asc("nome"));
        produtos = filtro.add(Restrictions.eq("status", true)).list();
        transacao.commit();
        return produtos;
    }

    @Override
    public List<Produto> buscarPreco(double preco) {
        List<Produto> produtos;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Produto.class);
        filtro.addOrder(Order.asc("nome"));
        produtos = filtro.add(Restrictions.like("preco_venda", preco)).list();
        transacao.commit();
        return produtos;
    }
}
