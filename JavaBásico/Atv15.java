
import java.util.Scanner;

public class Atv15 {
     public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int N,x=0,y=1,z;
        System.out.println("Digite um número: ");
        N=scan.nextInt();
        while (N<0 || N>46) {
            System.out.println("Digite um número acima de 0 e menor que 46");
            N=scan.nextInt();
        }
        for (int i = 0; i <=N-1; i++) {
            if (i==N) {
                System.out.println(x);
            }else{
                System.out.print(x+" ");
                z=x+y;
                x=y;
                y=z;
            }
        }
        scan.close();
    }
}

