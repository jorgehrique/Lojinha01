package Lojinha.RN;

import Lojinha.DAO.ClienteDAOHibernate;
import Lojinha.Entidades.Cliente;
import Lojinha.InterfaceDAO.ClienteDAO;
import Lojinha.Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteRN {

    private ClienteDAO clienteDAO;

    public ClienteRN() {
        clienteDAO = new ClienteDAOHibernate();
        clienteDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
    }

    public void salvar(Cliente cliente) {
        try {
            clienteDAO.salvar(cliente);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao salvar cliente", 2);
        }
    }

    public void atualizar(Cliente cliente) {
        try {
            clienteDAO.atualizar(cliente);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao atualizar cliente", 2);
        }
    }

    public void excluir(Cliente cliente) {
        try {
            clienteDAO.excluir(cliente);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao excluir cliente", 2);
        }
    }

    public Cliente buscarId(Integer id) {
        Cliente cliente = null;
        try {
            cliente = clienteDAO.buscarId(id);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar cliente", 2);
        }
        return cliente;
    }

    public Cliente buscarIdAtivo(Integer id) {
        Cliente cliente = null;
        try {
            cliente = clienteDAO.buscarId(id);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar cliente", 2);
        }
        return cliente;
    }

    public List<Cliente> buscarNome(String nome) {
        List<Cliente> clientes = null;
        try {
            clientes = clienteDAO.buscarNome(nome);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar cliente", 2);
        }
        return clientes;
    }

    public List<Cliente> buscarDescricao(String descricao) {
        List<Cliente> clientes = null;
        try {
            clientes = clienteDAO.buscarDescricao(descricao);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar clientes", 2);
        }
        return clientes;
    }

    public List<Cliente> buscarCidade(String cidade) {
        List<Cliente> clientes = null;
        try {
            clientes = clienteDAO.buscarCidade(cidade);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar clientes", 2);
        }
        return clientes;
    }

    public List<Cliente> buscarRua(String rua) {
        List<Cliente> clientes = null;
        try {
            clientes = clienteDAO.buscarRua(rua);
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao buscar clientes", 2);
        }
        return clientes;
    }

    public List<Cliente> listar() {
        List<Cliente> clientes = null;
        try {
            clientes = clienteDAO.listarAtivos();
        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e.getMessage(),
                    "Erro ao listar clientes", 2);
        }
        return clientes;
    }
}
