import java.util.Scanner;

public class Atv27 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x;
        float media=0;
        for (int i = 1; i < 5; i++) {
            System.out.print("Digite a "+i+"º medição do dia");
            x=scan.nextInt();
            if (x<110) {
                System.out.print("NORMAL");
            }else if (x>=110 && x<=125) {
                System.out.print("ALTERADA");
            }else if (x>125) {
                System.out.print("MUITO ALTERADA");
            }
            media=media+x;
        }
            System.out.print("MÉDIA DAS LEITURAS= ");
            System.out.format("%.2f",media/4);
            scan.close();
    }
}
