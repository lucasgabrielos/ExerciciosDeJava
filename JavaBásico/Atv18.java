import java.util.Scanner;

public class Atv18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numeroInverte;
        System.out.println("Digite um número para invertelo: ");
        numeroInverte=scan.nextInt();
        while (numeroInverte<1000 || numeroInverte>9999) {
            System.out.println("Digite um número de até 4 digítos: ");
            numeroInverte=scan.nextInt();
        }
        int numeroInvertido = 0;

        while (numeroInverte > 0) {
            numeroInvertido = numeroInvertido *10;
            numeroInvertido = numeroInvertido + (numeroInverte % 10);
            numeroInverte = numeroInverte / 10;
		}
		System.out.println(numeroInvertido);
        scan.close();
    }
}

        
    