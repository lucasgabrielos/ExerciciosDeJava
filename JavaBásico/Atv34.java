import java.util.Scanner;

public class Atv34 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x,y,cont=0;
        System.out.print("Digite o valor de números por linha: ");
        x=scan.nextInt();
        System.out.print("Digite a quantidade de números: ");
        y=scan.nextInt();
        for (int i = 1; i <=y; i++) {
            System.out.print(i+" ");
            cont++;
            if (cont==x) {
                System.out.println(" ");
                cont=0;
            }
        }
        scan.close();
    }
}
