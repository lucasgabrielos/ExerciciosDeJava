import java.util.Scanner;

public class Atv32 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int combu,al=0,gas=0,die=0;
        float qtd,totala=0,totalb=0,totalc=0;
        //Códigos dos combustíveis: 1 - álcool, 2 - Gasolina, 3- Diesel
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o código de acordo com o tipo do combustível");
            combu=scan.nextInt();
            if (combu==1) {
                al++;
                System.out.print("Digite a quantidade de litros colocados no abastecimento: ");
                qtd=scan.nextFloat();
                totala=qtd+totala;
            }else if (combu==2) {
                gas++;
                System.out.print("Digite a quantidade de litros colocados no abastecimento: ");
                qtd=scan.nextFloat();
                totalb=qtd+totalb;
            }else if (combu==3) {
                die++;
                System.out.print("Digite a quantidade de litros colocados no abastecimento: ");
                qtd=scan.nextFloat();
                totalc=qtd+totalc;
            }
        }
        System.out.println("1. Álcool: "+al+" - Qtd Litros: "+totala);
        System.out.println("2. Gasolina: "+gas+" - Qtd Litros: "+totalb);
        System.out.println("3. Diesel: "+die+" - Qtd Litros: "+totalc);
        scan.close();
    }
}
