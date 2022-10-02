package Atv03POO;

public class MeioDeTransporte {
    private int id;
    private short ano;
    private String modelo;
    private double carga_maxima;
    
    public MeioDeTransporte(int i, String m, double cm){
        this.id=i;
        //this.ano=a;
        this.modelo=m;
        this.carga_maxima=cm;
    }

    public double consumo(){
        return getCarga_maxima();
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(double carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

}
