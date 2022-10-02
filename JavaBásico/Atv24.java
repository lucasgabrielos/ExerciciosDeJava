import java.util.Scanner;

public class Atv24 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String num;
        String reverse="";
        System.out.print("Digite um número de 5 dígitos : ");
        num=scan.nextLine();
        for (int i = num.length()-1; i >=0; i--) {
            reverse+=num.charAt(i);
        }
        if (reverse.equals(num)) {
            System.out.println("S");
        }else{
            System.out.println("N");
        }
        scan.close();
    }
}
    

