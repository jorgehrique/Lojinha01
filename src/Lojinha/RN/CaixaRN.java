package Lojinha.RN;

import Lojinha.DAO.CaixaDAOHibernate;
import Lojinha.Entidades.Caixa;
import Lojinha.InterfaceDAO.CaixaDAO;
import Lojinha.Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;

public class CaixaRN {

    private CaixaDAO caixaDAO;

    public CaixaRN() {
        caixaDAO = new CaixaDAOHibernate(); 
        caixaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
    }

    public void salvar(Caixa caixa) {
        try {
            caixaDAO.salvar(caixa);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao salvar caixa", 2);
        }
    }

    public void atualizar(Caixa caixa) {
        try {
            caixaDAO.atualizar(caixa);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao atualizar caixa", 2);
        }
    }

    public void excluir(Caixa caixa) {
        try {
            caixaDAO.excluir(caixa);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao excluir caixa", 2);
        }
    }

    public Caixa buscarId(int id) {
        Caixa caixa;
        try {
            caixa = caixaDAO.buscarId(id);
        } catch (Throwable e) {
            caixa = null;
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar registro de caixa", 2);
        }
        return caixa;
    }

    public List<Caixa> listar() {
        List<Caixa> caixa;
        try {
            caixa = caixaDAO.listar();
        } catch (Throwable e) {
            caixa = null;
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao listar registros do caixa", 2);
        }
        return caixa;
    }

    public List<Caixa> listarGastos() {
        List<Caixa> caixa;
        try {
            caixa = caixaDAO.listarGastos();
        } catch (Throwable e) {
            caixa = null;
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao listar registros do caixa", 2);
        }
        return caixa;
    }

    public List<Caixa> listarGanhos() {
        List<Caixa> caixa;
        try {
            caixa = caixaDAO.listarGanhos();
        } catch (Throwable e) {
            caixa = null;
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao listar registros do caixa", 2);
        }
        return caixa;
    }
}
