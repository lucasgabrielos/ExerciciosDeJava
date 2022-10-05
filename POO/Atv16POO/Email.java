package Atv16POO;

import java.util.ArrayList;

public abstract class  Email  {
    private int NomeDoEmail;
    ArrayList<String> destinatario=new ArrayList<>(1);
    public int getNomeDoEmail() {
        return NomeDoEmail;
    }

    public void setNomeDoEmail(int nomeDoEmail) {
        NomeDoEmail = nomeDoEmail;
    }
    public void Escrever(){
        System.out.println("Classe: Email");
        System.out.println("Método: Escrever");
    }
    public void Excluir(){
        System.out.println("Classe: Email");
        System.out.println("Método: Excluir");
    }
    public void Anexar(){
        System.out.println("Classe: Email");
        System.out.println("Método: Anexar");
    }
    public void Responder(){
        System.out.println("Classe: Email");
        System.out.println("Método: Responder");
    }
}
