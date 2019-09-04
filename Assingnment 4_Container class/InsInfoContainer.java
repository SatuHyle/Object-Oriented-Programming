import java.util.ArrayList;
import java.util.Iterator;

public class InsInfoContainer{
    
    private ArrayList <InsuranceInfo> sailio = new ArrayList<InsuranceInfo>(5);
    
    //konstruktori
    //public InsInfoContainer(){
        
        //sailio = new ArrayList<InsuranceInfo>(5);
        
        private static InsInfoContainer c = null;
   
        private InsInfoContainer(){
            
        }
        
        public static InsInfoContainer getInstance(){
            
            if( c == null)
                c = new InsInfoContainer();
                
            return c;
        }    
    //}
    
    //metodi: lisaa vakuutustieto-olio sailioon
    public void addInsuranceInfo(InsuranceInfo i){
        sailio.add(i);
    }
    
    //metodi: tulostaa koko sailion
    public void tulosta(){
	   
        Iterator<InsuranceInfo> iter = sailio.iterator();
      
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }        
    
    //metodi: tulostaa kiinteiston, jonka vakuutusarvo rajaa suurempi
    public void tulosta_pieni(double arvo){
	   
        Iterator<InsuranceInfo> iter = sailio.iterator();
      
        while( iter.hasNext()){
           InsuranceInfo i = (InsuranceInfo)iter.next();
            if (i.getVakuutusarvo() > arvo){
                System.out.println(i);
            } else {
                
            }
        }
    }
    //metodi: tulostaa kiinteiston, jonka vakuutusarvo rajaa pienempi
    public void tulosta_iso(double arvo){
	   
        Iterator<InsuranceInfo> iter = sailio.iterator();
      
        while( iter.hasNext()){
           InsuranceInfo i = (InsuranceInfo)iter.next();
            if (i.getVakuutusarvo() < arvo){
                System.out.println(i);
            } else {
                
            }
        }
    }
}
