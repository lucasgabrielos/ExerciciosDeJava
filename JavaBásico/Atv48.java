import java.util.Scanner;

public class Atv48 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int idade,gotas=0;
        float peso;
        System.out.print("Informe a idade do paciente: ");
        idade=scan.nextInt();
        System.out.print("Informe o peso do paciente: ");
        peso=scan.nextFloat();
        if (idade>=12 && peso>=60) {
            gotas=1000;
        }else if (idade>=12 && peso<60) {
            gotas=875;
        }if (idade<12) {
            if (peso>=5 && peso<=9) {
                gotas=125;
            }else if (peso>9 && peso<=16) {
                gotas=250;
            }else if (peso>16 && peso<=24) {
                gotas=375;
            }else if (peso>24 && peso<=30) {
                gotas=500;
            }else if (peso>30) {
                gotas=750;
            }
        }
        System.out.println((gotas*20)/500+" gotas");    
        scan.close();

    }
}