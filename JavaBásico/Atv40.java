import java.util.Scanner;

public class Atv40 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.print("Digite o tamanho do primeiro lado do triângulo: ");
        a=scan.nextInt();
        System.out.print("Digite o tamanho do segundo lado do triângulo: ");
        b=scan.nextInt();
        System.out.print("Digite o tamanho do terceiro lado do triângulo: ");
        c=scan.nextInt();
         if (a>b+c || b>a+c || c>a+b) {
            System.out.println("VALORES NÃO FORMAM UM TRIÂNGULO");
        }else if (a==b && a==c && b==c ) {
            System.out.println("EQUILÁTERO");
        }else if (a==b || b==c || a==c) {
            System.out.println("ISÓSCELES");
        }else if (a!=b && b!=c && a!=c) {
            System.out.println("ESCALENO");
        }
        scan.close();
    }
}
