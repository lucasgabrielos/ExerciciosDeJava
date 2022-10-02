import java.util.Scanner;

public class Atv33 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,cont=0;
        System.out.print("Digite quantas vezes a linha deve ser repetida: ");
        n=scan.nextInt();
        for (int i = 0; i < n; i++) {
            cont++;
            for (int j = 1;cont<=n; j++) {
                cont++;
                System.out.print(j+" ");
                System.out.print((j+1)+" ");
                System.out.print((j+2)+" ");
                System.out.println("PUM");
                j=j+3;
            }
        }
        scan.close();
    }
}
