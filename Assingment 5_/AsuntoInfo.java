public class AsuntoInfo extends Rakennus{

    //muuttujat
    private Asukas ihminen;
    private double pinta_ala;
    private float huoneiden_lkm;

    //asetusmetodit
    public void setPinta_ala(double pinta_ala_par){
        pinta_ala = pinta_ala_par;
    }

    public void setHuoneiden_lkm(float huoneiden_lkm_par){
        huoneiden_lkm = huoneiden_lkm_par;
    }

    public boolean setAsukas(Asukas ihminen_par){
        if(ihminen == null ){
            ihminen = ihminen_par;
            return true;
        }else {
            return false;
        }
    }

    //saantometodit
    public double getPinta_ala(){
        return pinta_ala;
    }

    public float getHuoneiden_lkm(){
        return huoneiden_lkm;
    }

    public Asukas getAsukas(){
        return new Asukas(ihminen);
    }

    public String toString(){
        if(ihminen != null ) //jos talossa on asukas, tulosta...
            return ("Asunnon pinta-ala on " + pinta_ala + " ja huoneiden lukumaara on " + huoneiden_lkm + "\nTalossa asuu: " + ihminen.toString());
        else //jos talossa ei ole asukasta, tulosta...
            return ("Asunnon pinta-ala on " + pinta_ala + " ja huoneiden lukumaara on " + huoneiden_lkm + "\nAsunto on tyhja");
    }
}