import java.util.Scanner;

public class Atv09 {
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        int sgd,hh=0,mm=0;
        System.out.print("Digite a quantidade de segundos: ");
        sgd=scan.nextInt();
        for (int i = 0; i < sgd; i++) {
            if (sgd>3600) {
                hh++;
                sgd=sgd-3600;
            }else if (sgd<3600) {
                    if (sgd>60) {
                        mm=sgd/60;
                        sgd=sgd-(60*mm);
                                                
                    }
             }
        }
        System.out.println("HH:MM:SS = "+hh+":"+mm+":"+sgd);
        scan.close();
    }
}

