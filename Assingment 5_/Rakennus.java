public class Rakennus {

    //muuttujat

    private float asuntojen_lkm;
    private AsuntoInfo asunnon_tiedot;

    //tilanne ennen kuin talo on rakennettu
    public Rakennus(){
        asunnon_tiedot = null;
        asuntojen_lkm = 0;
    }
    
    //muodostin
    public Rakennus(float asuntojen_lkm_par, AsuntoInfo asunnon_tiedot_par){
        asunnon_tiedot = asunnon_tiedot_par;
        asuntojen_lkm = asuntojen_lkm_par;
    }

    public Rakennus getRakennus(Rakennus r){
        return new Rakennus(asuntojen_lkm, asunnon_tiedot);
    }

    public Rakennus(Rakennus r){
        ihminen = r.ihminen;
    }

    //asetusmetodit
    public void setAsuntojen_lkm(float asuntojen_lkm_par){
        asuntojen_lkm = asuntojen_lkm_par;
    }

    //saantimetodit
    public float getAsuntojen_lkm(){
        return asuntojen_lkm;
    }


}