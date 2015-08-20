package Lojinha.InterfaceDAO;

import Lojinha.Entidades.Cliente;
import Lojinha.Entidades.Produto;
import Lojinha.Entidades.Vendas;
import java.util.List;
import org.hibernate.Session;

public interface VendasDAO {

    public void setSession(Session sessao);

    public void salvar(Vendas venda);

    public void atualizar(Vendas venda);

    public void excluir(Vendas venda);

    public Vendas buscarId(int id);

    public List<Vendas> listar();

    public List<Vendas> listarAtivas();

    public List<Vendas> listarPorData(String data_venda);

    public List<Vendas> listarPorCliente(Cliente cliente);

    public List<Vendas> listarPorProduto(Produto produto);
}
