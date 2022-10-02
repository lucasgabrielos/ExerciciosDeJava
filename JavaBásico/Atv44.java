import java.util.Scanner;

public class Atv44 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double n,media=0,maior=0,menor=0,maiorP=0,cont=0,teste;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o "+i+"º número: ");
            n=scan.nextDouble();
            teste=n;
            if (n%2!=0.0) {
                media=media+n;
                cont++;
            }else if (n%2==0.0) {
                if (maiorP<n) {
                    maiorP=n;
                }
            }if (i==1) {
                maior=teste;
                menor=teste;
            }if (teste>maior) {
                maior=teste;
            }else if (teste<menor) {
                menor=teste;
            }
        }
        System.out.println("");
        System.out.format("Média dos Ímpares = "+"%.0f",(media/cont));
        System.out.println("");
        System.out.format("Maior número PAR = "+"%.0f",maiorP);
        System.out.println("");
        System.out.format("Diferença = "+"%.0f",(maior-menor));
        scan.close();
    }
}
