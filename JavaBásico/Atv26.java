import java.util.Scanner;

public class Atv26 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int idade,cont=0;
        float altura;
        System.out.print("Digite a altura da pessoa: ");
        altura=scan.nextFloat();
        System.out.print("Digite a idade da pessoa: ");
        idade=scan.nextInt();
            for (int i = 0; i < 1; i++) {
                if (altura>=1.5 && idade>=12) {
                    cont++;
                }
                if (altura>=1.4 && idade>=14) {
                    cont++;
                }
                if (altura>=1.7 && idade>=16) {
                    cont++;
                    System.out.println(cont);
                    break;
                }
                if (altura<1.4 && idade<12) {
                    System.out.println("Tá precisando tomar mais creatina");
                }
              
            } 
            scan.close();
    }
}
