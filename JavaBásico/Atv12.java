import java.util.Scanner;

public class Atv12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String especie,tipo,alimento,animal;
        System.out.println("Digite a primeira palavra que define o animal: ");
        especie=scan.nextLine();
        if (especie.equalsIgnoreCase("vertebrado")) {
            System.out.println("Digite a segunda palavra que representa o animal: ");
            tipo=scan.nextLine();
            if (tipo.equalsIgnoreCase("ave")) {
                System.out.println("Digite a terceira palavra que representa o animal: ");
                alimento=scan.nextLine();
                if (alimento.equalsIgnoreCase("carnivoro")) {
                    animal="Águia";
                    System.out.println("O animal é: "+animal);
                }else if (alimento.equalsIgnoreCase("onivoro")) {
                    animal="Pomba";
                    System.out.println("O animal é: "+animal);
                }
            }else if (tipo.equalsIgnoreCase("mamifero")) {
                System.out.println("Digite a terceira palavra que representa o animal: ");
                alimento=scan.nextLine();
                if (alimento.equalsIgnoreCase("onivoro")) {
                    animal="homem";
                    System.out.println("O animal é: "+animal);
                }else if (alimento.equalsIgnoreCase("herbivoro")) {
                    animal="Vaca";
                    System.out.println("O animal é: "+animal);
                }
            }
        }else if (especie.equalsIgnoreCase("invertebrado")) {
            System.out.println("Digite a segunda palavra que representa o animal: ");
            tipo=scan.nextLine();
            if (tipo.equalsIgnoreCase("inseto")) {
                System.out.println("Digite a terceira palavra que representa o animal: ");
                alimento=scan.nextLine();
                if (alimento.equalsIgnoreCase("hematofago")) {
                    animal="Pulga";
                    System.out.println("O animal é: "+animal);
                }else if (alimento.equalsIgnoreCase("herbivoro")) {
                    animal="Largata";
                    System.out.println("O animal é: "+animal);
                }
            }else if (tipo.equalsIgnoreCase("anelideo")) {
                System.out.println("Digite a terceira palavra que representa o animal: ");
                alimento=scan.nextLine();
                if (alimento.equalsIgnoreCase("hematofago")) {
                    animal="Sanguessuga";
                    System.out.println("O animal é: "+animal);
                }else if (alimento.equalsIgnoreCase("onivoro")) {
                    animal="Minhoca";
                    System.out.println("O animal é: "+animal);
                }
            }
        }
        scan.close();;
        
    }
}
