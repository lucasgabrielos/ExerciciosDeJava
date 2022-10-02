import java.util.Scanner;

public class Atv46 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N,M;
        long fatorial=1,soma=0,fatorar=1;
        System.out.print("Digite o número que deseja fatorar: ");
        N=scan.nextInt();
        for (int i = 1; i <=N; i++) {
            fatorial=fatorial*i;
        }
        System.out.print("Digite outro número que deseja fatorar: ");
        M=scan.nextInt();
        for (int i = 1; i <=M; i++) {
            fatorar=fatorar*i;
        }
        soma=fatorial+fatorar;
        System.out.println(soma);
        scan.close();
    }
}
