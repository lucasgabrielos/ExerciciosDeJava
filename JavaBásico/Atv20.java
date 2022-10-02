import java.util.Scanner;

public class Atv20 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String bairro;
        double total=0;
        int consumo,desconto=0,renda;
        System.out.println("CÓDIGO S: Santa Ana");
        System.out.println("CÓDIGO I: Industriários");
        System.out.println("CÓDIGO T: Tabatinga");
        System.out.print("Digite o código do bairro de acordo com a tabela acima:");
        bairro=scan.nextLine();
        if (bairro.equalsIgnoreCase("S")) {
            System.out.println("Digite a renda da familia: ");
            renda=scan.nextInt();
            while (renda<0) {
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
                renda=scan.nextInt();
            }if (renda>=50 && renda<500) {
                desconto=50;
            }else if (renda>500 && renda<=1000) {
                desconto=25;
            }else {
                desconto=0;
            }
            System.out.println("Digite o consumo da familia: ");
            consumo=scan.nextInt();
            while (consumo<0) {
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
                consumo=scan.nextInt();
            }
            total=consumo-desconto;
            System.out.format("%.2f",total);
        }else if(bairro.equalsIgnoreCase("I")){
            System.out.println("Digite a renda da familia: ");
            renda=scan.nextInt();
            while (renda<0) {
               System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
               renda=scan.nextInt(); 
            }if(renda>=240 && renda<1000 ){
                desconto=240;
            }else if (renda>=1000 && renda<=5000) {
                desconto=120;
            }else{
                desconto=0;
            }
            System.out.println("Digite o consumo da familia: ");
            consumo=scan.nextInt();
            while (consumo<0) {
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
                consumo=scan.nextInt();
            }
            total=consumo-desconto;
            System.out.format("%.2f",total);
        }else if (bairro.equalsIgnoreCase("T")) {
            System.out.println("Digite a renda da familia: ");
            renda=scan.nextInt();
            while (renda<0) {
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
                renda=scan.nextInt();
            }if (renda<=5000 && renda>=1000) {
                desconto=720;
            }else if (renda>=10000 && renda<=20000) {
                desconto=360;
            }else{
                desconto=0;
            }
            System.out.println("Digite o consumo da familia: ");
            consumo=scan.nextInt();
            while (consumo<0) {
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
                consumo=scan.nextInt();
            }
            total=consumo-desconto;
            System.out.format("%.2f",total);
        }else{
            System.out.println("BAIRRO INVÁLIDO");
        }
        scan.close();
    }
}
