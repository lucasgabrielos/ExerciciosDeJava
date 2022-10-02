import java.util.Scanner;

public class Atv08 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        double RH,RM,RC,RL,IR;
        int ALIO=0;
        System.out.println("Digite a renda do homem: ");
        RH=scan.nextDouble();
        System.out.println("Digite a renda da mulher: ");
        RM=scan.nextDouble();
        RC=RH+RM;
        if(RC<=900.00){
            ALIO=0;
        }else if(RC>900.00 && RC<=1500.00){
            ALIO=10;
        }else if(RC>1500.00 && RC<=2500.00){
            ALIO=15;
        }else if(RC>2500.00){
            ALIO=25;
        }
        IR=(RC*ALIO)/100;
        RL=RC-IR;
        System.out.format("RENDA CONJUNTA: "+"%.2f",RC);
        System.out.println("");
        System.out.println("ALÍQUOTA UTILIZADA: "+ALIO+"%");
        System.out.format("IMPOSTO DE RENDA: "+"%.2f",IR);
        System.out.println("");
        System.out.format("RENDA LÍQUIDA: "+"%.2f",+RL);
        scan.close();
    }
}
