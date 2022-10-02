import java.util.Scanner;

public class Atv41 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double peso,altura;
        System.out.print("Digite a sua altura: ");
        altura=scan.nextDouble();
        System.out.print("Digite o seu peso : ");
        peso=scan.nextDouble();
        if (altura<=1.50) {
            if (peso==50) {
                System.out.println("Parabéns peso ideal !");
            }else if (peso<50) {
                System.out.println("Engorde "+(50-peso)+"  Kg.");
            }else if (peso>50) {
                System.out.println("Emagreça "+(peso-50)+" kg.");
            }
        }else if (altura>=1.51 && altura<=1.90) {
            if (peso==70) {
                System.out.println("Parabéns peso ideal !");
            }else if (peso<70) {
                System.out.println("Engorde "+(70-peso)+"  Kg.");
            }else if (peso>70) {
                System.out.println("Emagreça "+(peso-70)+" kg.");
            }
        }else{
            if (peso==100) {
                System.out.println("Parabéns peso ideal !");
            }else if (peso<100) {
                System.out.println("Engorde "+(100-peso)+"  Kg.");
            }else if (peso>100) {
                System.out.println("Emagreça "+(peso-100)+" kg.");
            }
        }
        scan.close();
    }
}
