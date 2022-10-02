
import java.util.Scanner;

public class Atv30 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int m=0,n=0,soma=0;
            System.out.print("Digite o primeiro valor: ");
            m=scan.nextInt();
            System.out.print("Digite o segundo valor: ");
            n=scan.nextInt();
            if (m>n) {
                for (int j = n; j<=m; j++) {
                    System.out.print(j+" ");
                    soma=soma+j;
                }
                System.out.println("Soma = "+soma);
            }else{
                for (int j = m; j<=n; j++) {
                    System.out.print(j+" ");
                    soma=soma+j;
                }
                System.out.println("Soma = "+soma);
            }
            scan.close();
    }
} 
