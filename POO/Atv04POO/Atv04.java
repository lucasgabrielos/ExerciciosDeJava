public class Atv04 {
    public static void main(String[] args) {
        //Classe ItemDeLoja
        ItemDeLoja item=new ItemDeLoja();
        item.getIdentificador();
        System.out.println("====================");
        System.out.println("");
        //Classe Ferramenta
        Ferramenta f1=new Ferramenta();
        f1.getIdentificador();
        f1.separar();
        System.out.println("====================");
        System.out.println("");
        //Classe Alimento
        Alimento a1=new Alimento();
        a1.getIdentificador();
    }
}
