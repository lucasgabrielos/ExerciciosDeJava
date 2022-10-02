import java.util.Scanner;

public class Atv31 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        float a,b,media;
        System.out.println("Digite a primeira nota: ");
        a=scan.nextFloat();
        while (a<0 || a>10) {
            System.out.println("NOTA INVÁLIDA");
            System.out.println("Digite a primeira nota: ");
            a=scan.nextFloat();
        }
        System.out.println("Digite a segunda nota: ");
        b=scan.nextFloat();
        while (b<0 || b>10) {
            System.out.println("NOTA INVÁLIDA");
            System.out.println("Digite a segunda nota nota: ");
            b=scan.nextFloat();
        }
        media=(a+b)/2;
        System.out.print("MÉDIA = ");
        System.out.format("%.2f",media);
        scan.close();
        
    }
}
