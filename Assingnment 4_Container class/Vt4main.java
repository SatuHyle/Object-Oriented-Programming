import java.util.Iterator;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vt4main {
   
   public static void main(String [] args){
      	  
      InsInfoContainer repo = InsInfoContainer.getInstance();
 
      int valinta = 0;
      double arvo  = 0;
      InsuranceInfo p=null;
       
      do{
         tulostaValikko ();
         valinta = lueInt();
          
          
         switch ( valinta ){
            case 1:
               p = readInsurance();
                
               repo.addInsuranceInfo(p);
               break;
                
            case 2:
               System.out.println("Anna vakuutusarvo, jota halvemmat kiinteistot haluat tulostaa > ");
               arvo = lueDouble();
               repo.tulosta_iso(arvo);
               break;
                
            case 3:
               System.out.println("Anna vakuutusarvo, jota kalliimmat kiinteistot haluat tulostaa > ");
               arvo = lueDouble();
               repo.tulosta_pieni(arvo);
               break;
            
            case 4:
               repo.tulosta();
               break;
                
            case 0:
               System.out.print("Ohjelman suoritus paattyy.");
               break;
                
            default:
               System.out.print("Vaara valinta. Yrita uudelleen.");
         }
          
      }while ( valinta != 0);
   }
    
   public static void tulostaSailio(final ArrayList<InsuranceInfo> sailio){
       
      Iterator<InsuranceInfo> iter = sailio.iterator();
       
      while( iter.hasNext()){
         System.out.println(iter.next());
      }
       
       
   }
   public static void tulostaValikko() {
      System.out.println("\n\n 1) Lisaa kiinteisto sailion loppuun");
      System.out.println(" 2) Tulosta antamaasi arvoa halvemmat kiinteistot");
      System.out.println(" 3) Tulosta antamasi arvoa kalliimmat kiinteistot");
      System.out.println(" 4) Tulosta sailion sisalto");
      System.out.println(" 0) Lopeta");
      System.out.print("\nValintasi > ");
   }
    
   public static int lueInt(){
      Scanner sc = new Scanner(System.in);
      boolean ok = false;
      int luku = 0;
       
      do {
          
         try {
            luku = sc.nextInt();
            sc.nextLine();
            ok = true;
         }catch( InputMismatchException ime ){
            sc.nextLine();
            System.out.print("Virhe, yrita uudelleen > ");
         }
          
      }while(!ok);
       
      return luku;
       
   }
    
   public static double lueDouble(){
      Scanner sc = new Scanner(System.in);
      boolean ok = false;
      double luku = 0.0;
       
      do {
          
         try {
            luku = sc.nextDouble();
            sc.nextLine();
            ok = true;
         }catch( InputMismatchException ime ){
            sc.nextLine();
            System.out.print("Virhe, yrita uudelleen > ");
         }
          
      }while(!ok);
       
      return luku;
       
   }
    
   public static InsuranceInfo readInsurance(){
       
      Scanner sc = new Scanner(System.in);
       
      System.out.print("Anna kiinteiston tyyppi nimi  > ");
      String kiinteiston_tyyppi = sc.nextLine();
       
      System.out.print("Anna kiinteiston sijaintipaikka  > ");
      String sijaintipaikka = sc.nextLine();

      System.out.println("Anna vakuutusarvo > ");
      Double vakuutusarvo = sc.nextDouble();
      sc.nextLine();
      
      Property kiinteisto = new Property(kiinteiston_tyyppi, sijaintipaikka);

      return new InsuranceInfo(kiinteisto, vakuutusarvo);
       
   }
    
   public static void tulosta(InsuranceInfo i){
      System.out.println(i);
   }
}
