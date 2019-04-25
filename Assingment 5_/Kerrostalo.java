public class Kerrostalo extends Rakennus{

    private float asuntojen_lkm;

    //muodostin
    public Kerrostalo (double pinta_ala, float huoneiden_lkm, float asuntojen_lkm_par){
        super(pinta_ala, huoneiden_lkm);
        asuntojen_lkm = asuntojen_lkm_par;
        System.out.println("Luotiin kerrostalo");
    }

    public String toString(){
        return "Rakennettiin kerrostalo";
    }
    //printmetodi
    public void tulosta(){
        System.out.println("Rakennus on tyypiltaan kerrostalo");
        System.out.println("Asuntojen lukumaara: " + asuntojen_lkm);
        System.out.println("Pinta-ala on: " + getPinta_ala());
        System.out.println("Huoneiden lukumaara: " + getHuoneiden_lkm()); 
    }
}