package Lojinha.InterfaceDAO;

import Lojinha.Entidades.Produto;
import java.util.List;
import org.hibernate.Session;

public interface ProdutoDAO {

    public void setSession(Session sessao);

    public void salvar(Produto produto);

    public void atualizar(Produto produto);

    public void excluir(Produto produto);

    public Produto buscarId(int id);

    public Produto buscarIdAtivo(int id);

    public List<Produto> buscarNome(String nome);

    public List<Produto> buscarPreco(double preco);

    public List<Produto> listar();

    public List<Produto> listarAtivos();
}
