import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int num,horas;
        double valor,total;
        System.out.println("Digite o número do funcionário: ");
        num=scan.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horas=scan.nextInt();
        System.out.println("Digite o valor por hora: ");
        valor=scan.nextInt();
        total=horas*valor;
        System.out.println("Número do Funcionário: "+num);
        System.out.print("Sálario: R$ ");
        System.out.format("%.2f",total);
        scan.close();



    }
}
