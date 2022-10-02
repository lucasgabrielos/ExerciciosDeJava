import java.util.Scanner;

public class Atv43 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N,M;
        System.out.print("Digite o valor da compra: ");
        N=scan.nextInt();
        System.out.print("Digite o valor pago pelo cliente: ");
        M=scan.nextInt();
        while (N>M || M>10000) {
            System.out.print("Digite o valor pago pelo cliente: ");
            M=scan.nextInt();
        }
        if (M>(N+150)) {
            System.out.println("Impossível");
        }else{
            System.out.println("Possível");
        }
        scan.close();
    }
}
