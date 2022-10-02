import java.util.Scanner;


public class Atv10 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int ano=0,meses=0,qtd;
        System.out.println("Digite a quantidade de dias: ");
        qtd=scan.nextInt();
        for (int i = 0; i < qtd; i++) {
            if (qtd>=365) {
                ano++;
                qtd=qtd-365;
            }else if (qtd<365) {
               if (qtd>=30) {
                    meses=qtd/30;
                    qtd=qtd-(30*meses);
               }
            }
        }
        System.out.println(ano+" ano(s)");
        System.out.println(meses+" mês(es)");
        System.out.println(qtd+" dia(s)");
        scan.close();
        
    }
}
