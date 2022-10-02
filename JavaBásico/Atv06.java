import java.util.Scanner;

public class Atv06 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        double y,total;
        int x;
        System.out.println("Digite a distância total percorrida: ");
        x=scan.nextInt();
        System.out.println("Digite o total de combustível gasto: ");
        y=scan.nextDouble();
        total=x/y;
        System.out.format("%.3f",total);
        System.out.print(" km/l");
        scan.close();
    }
}
