public class Alimento extends ItemDeLoja{
    private Integer selo;
    
    public Alimento(){
        this.selo=100;
    }
    @Override
    public int getIdentificador(){
        System.out.println("Identificador:"+getSelo());
        return getSelo();
    }

    public Integer getSelo() {
        return selo;
    }

    public void setSelo(Integer selo) {
        this.selo = selo;
    }
    
}
