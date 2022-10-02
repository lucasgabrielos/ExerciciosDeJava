import java.util.Scanner;

public class Atv21 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int ano,novo=0;
        float velocidade=0,maior=0;
        for (int i = 1; i < 4; i++) {
            System.out.print("Digite o ano do "+i+"º carro: ");
            ano=scan.nextInt();
            if (ano>novo) {
                novo=ano;
            }
            System.out.print("Digite a velocidade do "+i+"º carro: ");
            velocidade=scan.nextFloat();
            if (velocidade>maior) {
                maior=velocidade;
            }
        }
        System.out.println("Ano do carro mais novo = "+ novo);
        System.out.println("A velocidade do mais rápido = "+ maior);
        scan.close();
    }
}
