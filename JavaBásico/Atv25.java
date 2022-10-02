import java.util.Scanner;


public class Atv25 {
   public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    String num;
    System.out.print("Digite a sequência de requisitos:  ");
    num=scan.nextLine();
    if (num.equals("10111") || num.equals("01111")) {
        System.out.println("AVALIADO");
    }else{
        System.out.println("0(ZERO)");
    }
    scan.close();
   } 
}
