import java.util.Scanner;

public class Atv17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x,n,z=0;
        System.out.print("Por favor, digite a quantidade de testes que deseja fazer: ");
        n=scan.nextInt();
        while (1>n || n>100) {
            System.out.print("Desculpe, o limite de testes é 100: ");
            n=scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número para saber se é primo ou não: ");
            x=scan.nextInt();
            for (int j = 2; j <= x; j++) {
                if (x%j==0) {
                    z++;
                }
            }
            if (z==1) {
                System.out.println(x+" é primo");
                z=0;
            }else{
                System.out.println(x+ " não é primo");
                z=0;
            }
        }
        scan.close();
    }
}

