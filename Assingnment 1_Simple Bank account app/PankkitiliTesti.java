import java.io.*;
import java.util.Scanner;

class PankkitiliTesti {
    
    private static Scanner lukija = new  Scanner( System.in ); 
        
    public static void main( String [] args ){
    
        Scanner lukija = new Scanner(System.in);
        
        //luetaan uuden tilin tiedot kayttajalta    
        System.out.println("Anna tilin omistajan nimi:");
        String omistaja = lukija.nextLine();
        System.out.println("Anna tilinumero:");
        String tilinumero = lukija.nextLine();
        System.out.println("Anna tilin saldo: ");
        double saldo = lukija.nextDouble();
        
        //luodaan uusi tili
        Pankkitili uusi_tili = new Pankkitili(omistaja, tilinumero, saldo);
        
        //tulostetaan uusi tili  
        System.out.println(uusi_tili.toString());
        
        //tehdaan rahan nosto tililta
        System.out.println("Kuinka paljon haluat nostaa?");
        double summa = lukija.nextDouble();
        uusi_tili.otto(summa);
        System.out.println("Tilin lopputilanne:");
        System.out.println(uusi_tili.toString());
        
        //talletetaan tilille rahaa
        System.out.println("Kuinka paljon haluat tallettaa?");
        double uusi_summa = lukija.nextDouble();
        uusi_tili.talletus(uusi_summa);
        System.out.println("Tilin lopputilanne:");
        System.out.println(uusi_tili.toString());       
    }

}