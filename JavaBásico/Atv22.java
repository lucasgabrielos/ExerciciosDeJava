import java.util.Scanner;

public class Atv22 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int valor=0,total=7;
        System.out.print("Digite o consumo de água da sua residência em m³: ");
        valor=scan.nextInt();
        for (int i = 0; i <= valor; i++) {
            if (i>=11 && i<=30) {
               total++;
            }else if (i>31 && i<100) {
                total=total+2;
            }else if (i>=100) {
                total=total+5;
            }
        }
        System.out.println(total);
        scan.close();
    }
}
