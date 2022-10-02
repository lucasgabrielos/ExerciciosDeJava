import java.util.Scanner;

public class Atv16 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double POPA,POPB;
        int cont=0;
        System.out.println("Digite a população atual do país A: ");
        POPA=scan.nextDouble();
        System.out.println("Digite a população atual do país B: ");
        POPB=scan.nextDouble();
        while (POPA>POPB) {
            System.out.println("A população de B tem que ser maior do que a população de A :");
            POPB=scan.nextDouble();
        }
        do {
            POPA=POPA+(POPA*3)/100;
            POPB=POPB+(POPB*1.5)/100;
            cont++;
        } while (POPA<POPB);
        System.out.println(cont+" anos");
        scan.close();
    }
}
