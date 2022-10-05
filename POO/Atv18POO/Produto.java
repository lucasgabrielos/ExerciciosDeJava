package Atv18POO;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Produto {
    private double peso;
    private int quantidade;
    private String nome;
    private BigDecimal valor;
    private String descricao;

    ArrayList<String> itemPedido=new ArrayList<>(1);
    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
