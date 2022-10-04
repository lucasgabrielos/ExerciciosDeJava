package Atv15POO;

import java.util.ArrayList;

public class Usuario {
    private String login;
    private String senha;
    private String permissao;

    ArrayList<String> Colaborador=new ArrayList<>();

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getPermissao() {
        return permissao;
    }
    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }
    private void editarPerfil(){
        System.out.println("Classe: Usuario");
        System.out.println("editarPerfil");
    }
    private void alterarSenha(){
        System.out.println("Classe: Usuario");
        System.out.println("AlterarSenha");
    }
    private void criarUsuario(){
        System.out.println("Classe: Usuario");
        System.out.println("criarUsuario");
    }
    private void apagarUsuario(){
        System.out.println("Classe: Usuario");
        System.out.println("apagarUsuario");
    }
}
