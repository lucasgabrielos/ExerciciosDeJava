import java.util.Scanner;

public class Atv45 {
    public static void main(String[] args) {
        //Scanner scan=new Scanner(System.in);
        String nome,nova="";
        float idade,maior=0,menor=0,media=0;
        for (int i = 1; i <=5; i++) {
            Scanner scan=new Scanner(System.in);
            System.out.print("Digite o nome da "+i+"º pessoa: ");
            nome=scan.nextLine();
            System.out.print("Digite a idade da "+i+"º pessoa: ");
            idade=scan.nextFloat();
            if (i==1) {
                maior=idade;
                menor=idade;
                nova=nome;
            }if (idade>maior) {
                maior=idade;
            }else if (menor>idade) {
                menor=idade;
                nova=nome;
            }
            media=media+idade;
            scan.close();
        }
        System.out.format("Maior idade = "+"%.0f",maior);
        System.out.println("");
        System.out.println("Nome da pessoa mais nova = "+nova);
        System.out.format("Média das idades = "+"%.1f",media/5);
    }
}
