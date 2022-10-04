package Atv15POO;

import java.util.ArrayList;

public class Parceiro {
    private String tipoPessoa;
    private float desempenho;
    
    ArrayList<String> juridica=new ArrayList<>();
    ArrayList<String> Fisica=new ArrayList<>();

    public String getTipoPessoa() {
        return tipoPessoa;
    }
    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
    public float getDesempenho() {
        return desempenho;
    }
    public void setDesempenho(float desempenho) {
        this.desempenho = desempenho;
    }
    public void cadastrar(){
        System.out.println("Classe: Parceiro");
        System.out.println("cadastrar");
    }
    public void bloquear(){
        System.out.println("Classe: Parceiro");
        System.out.println("bloquear");
    }
    public void excluir(){
        System.out.println("Classe: Parceiro");
        System.out.println("excluir");
    }
    
}
