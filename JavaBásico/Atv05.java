import java.util.Scanner;

public class Atv05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        int maior=0;
        int menor=0;
        int meio=0;
        System.out.println("Digite um número:");
        a=scan.nextInt(); 
        System.out.println("Digite outro número:");
        b=scan.nextInt();
        System.out.println("Digite outro número:");
        c=scan.nextInt();
        //maior
        if (a>b && a>c) {
            maior=a;
        }else if (b>a && b>c) {
            maior=b;
        }else if(c>a && c>b){
            maior=c;
        }
        System.out.println(maior);
        //menor
        if(a<b && a<c){
            menor=a;
        }else if (b<a && b<c) {
            menor=b;
        }else if(c<a && c<b){
            menor=c;
        }
        System.out.println(maior+" "+menor);
        //meio
        if(a<maior && a>menor){
            meio=a;

        }else if(b<maior && b>menor){  
            meio=b;
        }else if(c<maior && c>menor){
            meio=c;
        }
        System.out.println("Os números em ordem crescente são: ");
        System.out.println(menor+ " "+  meio + " "+maior);
        scan.close();
    }
}
