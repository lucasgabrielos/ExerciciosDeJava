import java.util.Scanner;

public class Atv37 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String jogador,jogador2,escolha,escolhaJ;
        int num,nume,resultado;
        System.out.print("Digite o nome do primeiro competidor: ");
        jogador=scan.nextLine().toUpperCase();
        while (jogador.length()>10) {
            System.out.print("O nome do competidor deve conter no máximo 10 letras:  ");
            jogador=scan.nextLine().toUpperCase();
        }
        System.out.print("Digite se ele escolheu PAR ou ÍMPAR: ");
        escolha=scan.nextLine();
        System.out.print("Digite o número escolhido: ");
        num=scan.nextInt();
        //JOGADOR NÚMERO 2 
        Scanner scanner=new Scanner(System.in);
        System.out.print("Digite o nome do segundo competidor: ");
        jogador2=scanner.nextLine().toUpperCase();
        while (jogador2.length()>10) {
            System.out.print("O nome do competidor deve conter no máximo 10 letras:  ");
            jogador2=scanner.nextLine().toUpperCase();
        }
        System.out.print("Digite se ele escolheu PAR ou ÍMPAR: ");
        escolhaJ=scanner.nextLine();
        while (escolhaJ.equalsIgnoreCase(escolha)) {
            System.out.print("Apenas um competidor pode escolher "+escolhaJ+" escolha a outra opção: ");
            escolhaJ=scanner.nextLine();
        }
        System.out.print("Digite o número escolhido: ");
        nume=scanner.nextInt();
        resultado=num+nume;
        if (resultado%2==0) {
            if (escolha.equalsIgnoreCase("par")) {
                System.out.print(jogador);
            }else if (escolhaJ.equalsIgnoreCase("par")) {
                System.out.print(jogador2);
            }
        }else{
            if (escolha.equalsIgnoreCase("impar")) {
                System.out.println("");
                System.out.print("O vencendor foi :"+ jogador);
            }else if (escolhaJ.equalsIgnoreCase("impar")) {
                System.out.println("");
                System.out.print("O vencedor foi : "+jogador2);
            }
        }
        scanner.close();
        scan.close();
    }
}
