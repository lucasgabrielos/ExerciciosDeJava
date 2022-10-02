import java.util.Scanner;

public class Atv23 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x,y;
        System.out.print("Digite o valor de X: ");
        x=scan.nextInt();
        System.out.print("Digite o valor de Y: ");
        y=scan.nextInt();
        if (x>y) {
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        if(x==y){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        if (x<y) {
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        if (x!=y) {
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        if (x>=y) {
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        scan.close();
    }
}
