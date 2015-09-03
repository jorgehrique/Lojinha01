package Lojinha.DAO;

import Lojinha.Entidades.Cliente;
import Lojinha.Entidades.Produto;
import Lojinha.Entidades.Vendas;
import Lojinha.InterfaceDAO.VendasDAO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class VendasDAOHibernate implements VendasDAO {

    private Transaction transacao;
    private Session sessao;

    @Override
    public void setSession(Session sessao) {
        this.sessao = sessao;
    }

    @Override
    public void salvar(Vendas venda) {
        transacao = sessao.beginTransaction();
        sessao.save(venda);
        transacao.commit();
    }

    @Override
    public void atualizar(Vendas venda) {
        transacao = sessao.beginTransaction();
        sessao.update(venda);
        transacao.commit();
    }

    @Override
    public void excluir(Vendas venda) {
        transacao = sessao.beginTransaction();
        sessao.delete(venda);
        transacao.commit();
    }

    @Override
    public List<Vendas> listar() {
        List<Vendas> historico;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Vendas.class);
        historico = filtro.list();
        transacao.commit();
        return historico;
    }

    @Override
    public List<Vendas> listarAtivas() {
        List<Vendas> historico;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Vendas.class)
                .add(Restrictions.eq("status", true))
                .addOrder(Order.asc("dataVenda"));
        historico = filtro.list();
        transacao.commit();
        return historico;
    }

    @Override
    public List<Vendas> listarPorData(String data_venda) {
        List<Vendas> historico;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Vendas.class)
                .add(Restrictions.eq("status", true));
        filtro.addOrder(Order.asc("dataVenda"));
        historico = filtro.add(Restrictions.like("dataVenda", "%" + data_venda + "%")).list();
        transacao.commit();
        return historico;
    }

    @Override
    public Vendas buscarId(int id) {
        Vendas venda;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Vendas.class);
        venda = (Vendas) filtro.add(Restrictions.eq("id", id)).uniqueResult();
        transacao.commit();
        return venda;
    }

    @Override
    public List<Vendas> listarPorCliente(Cliente cliente) {
        List<Vendas> vendas;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Vendas.class);
        filtro.addOrder(Order.asc("dataVenda"));
        vendas = filtro.add(Restrictions.eq("cliente", cliente)).list();
        transacao.commit();
        return vendas;
    }

    @Override
    public List<Vendas> listarPorProduto(Produto produto) {
        List<Vendas> vendas;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Vendas.class);
        filtro.addOrder(Order.asc("dataVenda"));
        vendas = filtro.add(Restrictions.eq("produto", produto)).list();
        transacao.commit();
        return vendas;
    }
}
