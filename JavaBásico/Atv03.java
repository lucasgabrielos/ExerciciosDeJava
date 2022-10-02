import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String vendedor;
        Double salario,total,totalv;
        System.out.println("Digite o nome do vendedor: ");
        vendedor=scan.nextLine();
        System.out.println("Digite o sálario fixo do vendedor: ");
        salario=scan.nextDouble();
        System.out.println("Digite o total de vendas do vendedor: ");
        totalv=scan.nextDouble();
        total=(totalv*15)/100;
        System.out.println("Nome do vendedor: "+vendedor);
        System.out.println("Salário: "+salario);
        System.out.println("Total de vendas: "+totalv);
        System.out.println("TOTAL: ");
        System.out.printf("%.2f",(total+salario));
        scan.close();

    }
}