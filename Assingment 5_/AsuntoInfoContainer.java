import java.util.ArrayList;
import java.util.Iterator;

public class AsuntoInfoContainer{

    private ArrayList <AsuntoInfo> sailio = new ArrayList <AsuntoInfo>(5);

    private static AsuntoInfoContainer c = null;
   
    private AsuntoInfoContainer(){
        
    }
    
    public static AsuntoInfoContainer getInstance(){
        
        if( c == null)
            c = new AsuntoInfoContainer();
            
        return c;
    }

    public void addAsuntoInfo(AsuntoInfo i){
        sailio.add(i);
    }

    //metodi: tulostaa koko sailion
    public void tulosta(){
    
        Iterator<AsuntoInfo> iter = sailio.iterator();
        
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }   
}