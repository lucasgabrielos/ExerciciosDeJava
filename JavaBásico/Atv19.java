import java.util.Scanner;

public class Atv19 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double sal;
        System.out.print("Digite o salário do funcionário: ");
        sal=scan.nextDouble();
        if (sal>500) {
            sal=sal+(sal*10)/100;
        }else if (sal>300 && sal<=500) {
            sal=sal+(sal*7)/100;
        }else{
            sal=sal+(sal*5)/100;
        }
        System.out.format("%.2f",sal);
        scan.close();;
    }
}
