import java.util.Scanner;
public class Atv04 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int a,b,c;
        int maior=0;
        int menor=0;
        System.out.print("Digite um número: ");
        a=scan.nextInt();
        System.out.print("Digite outro número: ");
        b=scan.nextInt();
        System.out.print("Digite mais um número: ");
        c=scan.nextInt();
        //Maior
        if (a>b && a>c) {
            maior=a;
        }else if(b>a && b>c){
            maior=b;
        }else{
            maior=c;
        }
        //menor
        if (a<b && a<c) {
            menor=a;
        }else if(b<a && b<c){
            menor=b;
        }else{
            menor=c;
        }
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
        scan.close();
    }
}