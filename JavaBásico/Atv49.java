import java.util.Scanner;

public class Atv49 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        float peso, altura,imc;
        System.out.print("Digite o peso: ");
        peso=scan.nextFloat();
        System.out.print("Digite a altura: ");
        altura=scan.nextFloat();
        imc=peso/(altura*altura);
        if (imc<20) {
            System.out.println("IMC = "+imc+" - Abaixo do peso");
        }else if (imc>=20 && imc<25) {
            System.out.println("IMC = "+imc+" - Peso Normal");
        }else if (imc>=25 && imc<30) {
            System.out.println("IMC = "+imc+" - Sobrepeso");
        }else if (imc>=30 && imc<40) {
            System.out.println("IMC = "+imc+" - Obeso");
        }else{
            System.out.println("IMC = "+imc+" - Obeso Mórbido");
        }
        scan.close();
    }
}
