import java.util.Scanner;

public class Atv38 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,cont=0;
        System.out.println("Digite um número para saber se ele é primo: ");
        n=scan.nextInt();
        for (int i = 1; i < n; i++) {
            if (n%i==0) {
                cont++;
            }
        }
        if (cont>2) {
            System.out.println("NÃO É PRIMO");
        }else{
            System.out.println("É PRIMO");
        }
        scan.close();
    }
}
