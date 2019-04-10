import java.util.Iterator;

public class InsuranceInfo{
    
    private Property kiinteisto;
    private double vakuutusarvo;
    
    //konstruktori
    public InsuranceInfo(Property kiinteisto_par, double vakuutusarvo_par){
        kiinteisto = kiinteisto_par;
        vakuutusarvo = vakuutusarvo_par;
    }
    
    //asetusmetodit
    public void setKiinteisto(Property kiinteisto_par){
        kiinteisto = kiinteisto_par;
    }
    
    public void setVakuutusarvo(double vakuutusarvo_par){
        vakuutusarvo = vakuutusarvo_par;
    }
    
    //saantimetodit
    public Property getKiinteisto(){
        return kiinteisto;
    }
    
    public double getVakuutusarvo(){
        return vakuutusarvo;
    }

    public void tulosta(){
   
    }
}
