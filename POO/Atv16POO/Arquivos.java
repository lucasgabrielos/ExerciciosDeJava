package Atv16POO;

public class Arquivos extends Email {
    private String nomeArquivo;
    private int Tamanho;
    private String Formato;
   
    public String getNomeArquivo() {
        return nomeArquivo;
    }
    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    public int getTamanho() {
        return Tamanho;
    }
    public void setTamanho(int tamanho) {
        Tamanho = tamanho;
    }
    public String getFormato() {
        return Formato;
    }
    public void setFormato(String formato) {
        Formato = formato;
    }
    @Override
    public void Anexar() {
        System.out.println("Classe: Arquivos");
        System.out.println("Método: Anexar");
        super.Anexar();
    }
    public void Remover(){
        System.out.println("Classe: Arquivos");
        System.out.println("Método: Remover");
    }
}
