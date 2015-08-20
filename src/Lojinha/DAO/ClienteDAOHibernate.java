package Lojinha.DAO;

import Lojinha.Entidades.Cliente;
import Lojinha.InterfaceDAO.ClienteDAO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class ClienteDAOHibernate implements ClienteDAO {

    private Transaction transacao;
    private Session sessao;

    @Override
    public void setSession(Session sessao) {
        this.sessao = sessao;
    }

    @Override
    public void salvar(Cliente cliente) {
        transacao = sessao.beginTransaction();
        sessao.save(cliente);
        transacao.commit();
    }

    @Override
    public void atualizar(Cliente cliente) {
        transacao = sessao.beginTransaction();
        sessao.update(cliente);
        transacao.commit();
    }

    @Override
    public void excluir(Cliente cliente) {
        transacao = sessao.beginTransaction();
        sessao.delete(cliente);
        transacao.commit();
    }

    @Override
    public Cliente buscarId(int id) {
        Cliente cliente;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Cliente.class);
        cliente = (Cliente) filtro.add(Restrictions.eq("id", id)).uniqueResult();
        transacao.commit();
        return cliente;
    }

    @Override
    public Cliente buscarIdAtivo(int id) {
        Cliente cliente;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Cliente.class)
                .add(Restrictions.eq("status", true));;
        cliente = (Cliente) filtro.add(Restrictions.eq("id", id)).uniqueResult();
        transacao.commit();
        return cliente;
    }

    @Override
    public List<Cliente> listarAtivos() {
        List<Cliente> clientes;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Cliente.class);
        filtro.add(Restrictions.eq("status", true)).addOrder(Order.asc("nome"));
        clientes = filtro.list();
        transacao.commit();
        return clientes;
    }

    @Override
    public List<Cliente> buscarNome(String nome) {
        List<Cliente> clientes;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Cliente.class)
                .add(Restrictions.eq("status", true));   
        clientes = filtro.add(Restrictions.like("nome", "%" + nome + "%")).list();
        transacao.commit();
        return clientes;
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> clientes;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Cliente.class)
                .addOrder(Order.asc("nome"));
        clientes = filtro.list();
        transacao.commit();
        return clientes;
    }

    @Override
    public List<Cliente> buscarDescricao(String descricao) {
        List<Cliente> clientes;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Cliente.class);
        filtro.addOrder(Order.asc("nome"));
        filtro.add(Restrictions.like("descricao", "%" + descricao + "%"));
        clientes = filtro.add(Restrictions.eq("status", true)).list();
        transacao.commit();
        return clientes;
    }

    @Override
    public List<Cliente> buscarCidade(String cidade) {
        List<Cliente> clientes;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Cliente.class);
        filtro.add(Restrictions.like("cidade", "%" + cidade + "%"));
        filtro.addOrder(Order.asc("nome"));
        clientes = filtro.add(Restrictions.eq("status", true)).list();
        transacao.commit();
        return clientes;
    }

    @Override
    public List<Cliente> buscarRua(String rua) {
        List<Cliente> clientes;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Cliente.class);
        filtro.add(Restrictions.like("rua", "%" + rua + "%"));
        filtro.addOrder(Order.asc("nome"));
        clientes = filtro.add(Restrictions.eq("status", true)).list();
        transacao.commit();
        return clientes;
    }
}
