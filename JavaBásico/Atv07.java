import java.util.Scanner;
public class Atv07 {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int n,cem,cinquenta,vinte,dez,cinco,dois,sobra;
        System.out.println("Digite o valor que deseja decompor: ");
        n=scan.nextInt();
        while(n<0 || n>1000000) {
            if(n<0 || n>100000);{
                System.out.println("Digite um valor maior que zero e menor que um milhão...");
                n=scan.nextInt();
            }
        }
            sobra=n;
            cem=sobra/100;
            sobra=sobra-(cem*100);
            cinquenta=sobra/50;
            sobra=sobra-(cinquenta*50);
            vinte=sobra/20;
            sobra=sobra-(vinte*20);
            dez=sobra/10;
            sobra=sobra-(dez*10);
            cinco=sobra/5;
            sobra=sobra-(cinco*5);
            dois=sobra/2;
            sobra=sobra-(dois*2);
            System.out.println(n);
            System.out.println(cem+" notas de R$ 100,00");
            System.out.println(cinquenta+" notas de R$ 50,00");
            System.out.println(vinte+" notas de R$ 20,00");
            System.out.println(dez+" notas de R$ 10,00");
            System.out.println(cinco+" notas de R$ 5,00");
            System.out.println(dois+" notas de R$ 2,00");
            System.out.println(sobra+" notas de R$ 1,00");
            scan.close();
        }
        
    }

