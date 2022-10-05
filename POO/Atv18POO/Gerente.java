package Atv18POO;

import java.util.ArrayList;

public class Gerente extends Pessoa {

    ArrayList<String>PedidoBasico=new ArrayList<>();
    ArrayList<String>Funcionario=new ArrayList<>();

    public void listaFuncion(){
        System.out.println("Classe: Gerente");
        System.out.println("Método: listaFuncion");
    }
    public void listaClinte(){
        System.out.println("Classe: Gerente");
        System.out.println("Método: listaCliente");
    }
    public void criarFuncionario(){
        System.out.println("Classe: Gerente");
        System.out.println("Método: CriarFuncionario");
    }
}
