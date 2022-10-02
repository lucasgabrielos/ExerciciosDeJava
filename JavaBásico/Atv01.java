import java.util.Scanner;

public class Atv01 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        float a,b;
        double media,mediaf;
        System.out.println("Digite a primeira nota: ");
        a=scan.nextFloat();
        System.out.println("Digite a segunda nota: ");
        b=scan.nextFloat();
        media=(a*3.5)+(b*7.5);
        mediaf=media/11;
        System.out.print("Média: = ");
        System.out.format("%.5f",mediaf);
        scan.close();

    }
}