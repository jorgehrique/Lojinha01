package Lojinha.Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "Caixa")
@SQLDelete(sql = "update Caixa set status = 0 where id = ?")
public class Caixa implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String descricao;

    @Column
    private boolean tipo;

    @Column
    private boolean status;

    @Column
    private double preco;

    @Column
    private String data_caixa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getData_caixa() {
        return data_caixa;
    }

    public void setData_caixa(String data_caixa) {
        this.data_caixa = data_caixa;
    }
}
