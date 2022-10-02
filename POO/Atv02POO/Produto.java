package Atv02POO;
import java.util.Date;

public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    private Date validade;

    public Produto(Integer i, String n, String d ){
        this.id=i;
        this.nome=n;
        this.descricao=d;
    }
    public Integer getCod(){
        System.out.println("O id é: "+getId());
        return getId();
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
}
