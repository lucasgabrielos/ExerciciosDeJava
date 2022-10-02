import java.util.Scanner;

public class Atv14 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x;
        System.out.print("Digite um número: ");
        x=scan.nextInt();
        while (x<0) {
            System.out.print("Digite um número inteiro positivo: ");
            x=scan.nextInt();
        }
        if (x%2==0) {
            x=x+1;
            for (int i = 0; i < 6; i++) {
                System.out.println(x);
                x=x+2;
            }
        }else{
            for (int i = 0; i < 6; i++) {
                x=x+2;
                System.out.println(x);
            }
        }  
        scan.close();      
    }
}

