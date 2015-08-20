package Lojinha.InterfaceDAO;

import Lojinha.Entidades.Caixa;
import java.util.List;
import org.hibernate.Session;

public interface CaixaDAO {

    public void setSession(Session sessao);

    public void salvar(Caixa caixa);

    public void atualizar(Caixa caixa);

    public void excluir(Caixa caixa);

    public Caixa buscarId(int id);

    List<Caixa> listar();

    List<Caixa> listarAtivos();

    // ativos
    List<Caixa> listarGastos();

    List<Caixa> listarGanhos();
}
