import java.util.Scanner;

public class Atv39 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.print("Digite um número para saber a sua tabuada: ");
        n=scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" X "+i+" = "+n*i);
        }
        scan.close();
    }
}
