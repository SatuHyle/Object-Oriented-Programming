import java.util.ArrayList;
import java.util.Iterator;

public class InsInfoContainer{
    
    private ArrayList <InsuranceInfo> sailio;
    
    //konstruktori
    public InsInfoContainer(){
        
        sailio = new ArrayList<InsuranceInfo>(5);       
    }
    
    //metodi: lisaa vakuutustieto-olio sailioon
    public void addInsuranceInfo(InsuranceInfo p){
        sailio.add(p);
    }
    
    //metodi: tulostaa koko sailion
    public void tulosta(){
	   
        Iterator<InsuranceInfo> iter = sailio.iterator();
      
        while( iter.hasNext()){
            System.out.println(iter.next());
        }
    }        
    
    //metodi: tulostaa kiinteiston, jonka vakuutusarvo rajaa suurempi
    public void tulosta_pieni(double arvo){
	   
        Iterator<InsuranceInfo> iter = sailio.iterator();
      
        while( iter.hasNext()){
           InsuranceInfo p = (InsuranceInfo)iter.next();
            if (p.getVakuutusarvo() > arvo){
                System.out.println(p);
            } else {
                
            }
        }
    }
    //metodi: tulostaa kiinteiston, jonka vakuutusarvo rajaa pienempi
}
