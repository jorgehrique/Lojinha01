package Lojinha.InterfaceDAO;

import Lojinha.Entidades.Cliente;
import java.util.List;
import org.hibernate.Session;

public interface ClienteDAO {

    public void setSession(Session sessao);

    public void salvar(Cliente cliente);

    public void atualizar(Cliente cliente);

    public void excluir(Cliente cliente);

    public Cliente buscarId(int id);

    public Cliente buscarIdAtivo(int id);

    public List<Cliente> buscarNome(String nome);

    public List<Cliente> buscarDescricao(String descricao);

    public List<Cliente> buscarCidade(String cidade);

    public List<Cliente> buscarRua(String rua);

    public List<Cliente> listar();

    public List<Cliente> listarAtivos();

}
