package Atv03POO;

public class Terrestre extends MeioDeTransporte{
    
    private int qtdRoda;
    private double potencia;
    public Terrestre(int i, String m, double cm, int qtd, double p) {
        super(i, m, cm);
        this.qtdRoda=qtd;
        this.potencia=p;
    }

    @Override
    public double consumo() {
        System.out.println((getCarga_maxima()*getPotencia())*100);
        return (getCarga_maxima()*getPotencia())*100;
    }
    
    public int getQtdRoda() {
        return qtdRoda;
    }
    public void setQtdRoda(int qtdRoda) {
        this.qtdRoda = qtdRoda;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}
