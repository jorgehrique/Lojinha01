package Lojinha.Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "cliente")
@SQLDelete(sql = "update Cliente set status = 0 where id = ?")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private boolean status;

    @Column
    private String telefone1;

    @Column
    private String telefone2;

    @Column
    private String cidade;

    @Column
    private int num;

    @Column
    private String estado;

    @Column
    private String rua;

    @OneToMany(mappedBy = "cliente")
    private List<Vendas> historico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Vendas> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Vendas> historico) {
        this.historico = historico;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
