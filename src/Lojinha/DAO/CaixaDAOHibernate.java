package Lojinha.DAO;

import Lojinha.Entidades.Caixa;
import Lojinha.InterfaceDAO.CaixaDAO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class CaixaDAOHibernate implements CaixaDAO {

    private Session sessao;
    private Transaction transacao;

    @Override
    public void setSession(Session sessao) {
        this.sessao = sessao;
    }

    @Override
    public void salvar(Caixa caixa) {
        transacao = sessao.beginTransaction();
        sessao.save(caixa);
        transacao.commit();
    }

    @Override
    public void atualizar(Caixa caixa) {
        transacao = sessao.beginTransaction();
        sessao.update(caixa);
        transacao.commit();
    }

    @Override
    public void excluir(Caixa caixa) {
        transacao = sessao.beginTransaction();
        sessao.delete(caixa);
        transacao.commit();
    }

    @Override
    public List<Caixa> listar() {
        List<Caixa> caixa;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Caixa.class);
        caixa = filtro.list();
        transacao.commit();
        return caixa;
    }

    @Override
    public List<Caixa> listarAtivos() {
        List<Caixa> caixa;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Caixa.class)
                .add(Restrictions.eq("status", true));
        caixa = filtro.list();
        transacao.commit();
        return caixa;
    }

    @Override
    public List<Caixa> listarGastos() {
        List<Caixa> caixa;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Caixa.class)
                .add(Restrictions.eq("status", true))
                .add(Restrictions.eq("tipo", false));
        caixa = filtro.list();
        transacao.commit();
        return caixa;
    }

    @Override
    public List<Caixa> listarGanhos() {
        List<Caixa> caixa;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Caixa.class)
                .add(Restrictions.eq("status", true))
                .add(Restrictions.eq("tipo", true));
        caixa = filtro.list();
        transacao.commit();
        return caixa;
    }

    @Override
    public Caixa buscarId(int id) {
        Caixa caixa;
        transacao = sessao.beginTransaction();
        Criteria filtro = sessao.createCriteria(Caixa.class)
                .add(Restrictions.eq("id", id));
        caixa = (Caixa) filtro.uniqueResult();
        transacao.commit();
        return caixa;
    }
}
