package Atv01POO;
public class Transporte {
    private Integer id;
    private Integer ano;
    private String modelo;
    private Double carga_maxima;
    private Double potencia;
    
    public Transporte(){
    }
    
    public Transporte(Integer i, Integer a, String m, Double cm, Double p){
        this.id=i;
        this.ano=a;
        this.modelo=m;
        this.carga_maxima=cm;
        this.potencia=p;
    }
    public Double consumo(){
        System.out.format("%.2f",(getCarga_maxima()*getPotencia())*100);
        return (getCarga_maxima()*getPotencia())*100;
        
    }
    public void Mostrar(){
        System.out.println(getModelo());
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Double getPotencia() {
        return potencia;
    }
    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public Double getCarga_maxima() {
        return carga_maxima;
    }
    
}
