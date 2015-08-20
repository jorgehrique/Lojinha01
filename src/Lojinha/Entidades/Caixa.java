package Lojinha.Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "caixa")
@SQLDelete(sql = "update Caixa set status = 0 where id = ?")
public class Caixa implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 60)
    private String descricao;

    @Column
    private boolean tipo;

    @Column
    private boolean status;

    @Column
    private float preco;

    @Column(name = "data_caixa", length = 11)
    private String dataCaixa;

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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDataCaixa() {
        return dataCaixa;
    }

    public void setDataCaixa(String dataCaixa) {
        this.dataCaixa = dataCaixa;
    }
}
