import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int tempo,inicio,fim;
        System.out.println("Digite a hora que o jogo começou:");
        inicio=scan.nextInt();
        System.out.println("Digite a hora que o jogo terminou: ");
        fim=scan.nextInt();
        tempo=24-(24+inicio-fim)%24;
        if(inicio==fim){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else{
            System.out.println("O JOGO DUROU "+tempo+" HORA(S)"); 
        }
        scan.close();;
    }
}
