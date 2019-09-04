public class Omakotitalo extends Rakennus {

    //muodostin
    public Omakotitalo (double pinta_ala, float huoneiden_lkm){
        super(pinta_ala, huoneiden_lkm);
        System.out.println("Luotiin omakotitalo");
    }

    //printmetodi
    public void tulosta(){
        System.out.println("Rakennus on tyypiltaan omakotitalo");
        System.out.println("Pinta-ala on: " + getPinta_ala());
        System.out.println("Huoneiden lukumaara: " + getHuoneiden_lkm());
    }
}