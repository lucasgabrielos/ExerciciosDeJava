import java.util.Scanner;

public class Atv42 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double A,B,total,diferença;
        System.out.print("Digite o antigo valor do ingresso: ");
        A=scan.nextDouble();
        System.out.print("Digite o novo valor do ingresso: ");
        B=scan.nextDouble();
        while (B<A || B>1000) {
            System.out.print("Digite o novo valor corretamente: ");
            B=scan.nextDouble();  
        }
        diferença=B-A;
        total=(diferença/A)*100;
        System.out.format("%.0f",total);
        System.out.print("%");
        scan.close();
        
    }   
}
