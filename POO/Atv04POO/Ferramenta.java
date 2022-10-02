import java.util.Scanner;

public class Ferramenta extends ItemDeLoja {
    private String categoria;
    private Integer serial;
    
    public Ferramenta(){
        this.serial=200;
    }

    public void separar(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Digite a categoria do produto: ");
        setCategoria(scan.nextLine());
        if (getCategoria()=="") {
            setCategoria("outros");
        }
        scan.close();
        System.out.println("Categoria: "+getCategoria());
    }
    public void separa(){
        System.out.println("Não entendi o que é pra fazer neste método");
    }

    @Override
    public int getIdentificador(){
        System.out.println("Identificador: "+getSerial());
        return getSerial();
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }
}
