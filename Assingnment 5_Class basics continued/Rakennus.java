class Rakennus {

    //muuttujat
    private double pinta_ala;
    private float huoneiden_lkm;
    private Asukas ihminen = null;

    //tilanne ennen kuin talo on rakennettu
    public Rakennus(){
        pinta_ala = 0.0;
        huoneiden_lkm = 0;
        ihminen = null;
    }
    
    //muodostin
    public Rakennus(double pinta_ala_par, float huoneiden_lkm_par){
        pinta_ala = pinta_ala_par;
        huoneiden_lkm = huoneiden_lkm_par;
        ihminen = null;
    }

    public Rakennus(Rakennus r){
        ihminen = r.ihminen;
    }

    //asetusmetodit
    public boolean setAsukas(Asukas ihminen){
        if(ihminen == null ){
            ihminen = ihminen;
            return true;
        }else {
            return false;
        }
    }

    public void setPinta_ala(double pinta_ala_par){
        pinta_ala = pinta_ala_par;
    }

    public void setHuoneiden_lkm(float huoneiden_lkm_par){
        huoneiden_lkm = huoneiden_lkm_par;
    }

    //saantimetodit
    public double getPinta_ala(){
        return pinta_ala;
    }

    public float getHuoneiden_lkm(){
        return huoneiden_lkm;
    }

    public Rakennus getRakennus(Rakennus r){
        return new Rakennus();
    }

    public Asukas getAsukas(){
        return new Asukas(ihminen);
    }

    public void tulosta(){

    }   

    public String toString(){
        if(ihminen != null ) //jos talossa on asukas, tulosta...
            return ("Rakennuksen pinta-ala on " + pinta_ala + " ja huoneiden lukumaara on " + huoneiden_lkm + "\nTalossa asuu: " + ihminen.toString());
        else //jos talossa ei ole asukasta, tulosta...
            return ("Rakennuksen pinta-ala on " + pinta_ala + " ja huoneiden lukumaara on " + huoneiden_lkm + "\nRakennus on asumaton");
    }
}