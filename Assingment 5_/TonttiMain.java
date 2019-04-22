import java.io.*;
import java.util.Scanner;

class TonttiMain {

    private static Scanner sc = new Scanner( System.in );

    public static void main( String [] args ){

    //muuttujat
    Tontti tontti;
    Rakennus rakennus;
    Asukas asukas;
    
    //kysellaan tiedot tonttia varten
    System.out.print("Anna tontin nimi: ");
    String nimi = sc.nextLine();
    
    System.out.print("Anna tontin osoite: ");
    String osoite = sc.nextLine();
    
    System.out.print("Anna tontin pinta-ala: ");
    double pinta_ala = sc.nextDouble();
    sc.nextLine();
    
    //rakennetaan tontti
    tontti = new Tontti(nimi, osoite, pinta_ala);
    
    //ilmoitetaan, etta tontti luotiin
    System.out.println("\nPystytettiin tontti: " +  tontti.toString());
    
    //kysellaan rakennuksen tiedot
    System.out.print("\nAnna rakennuksen pinta-ala: ");
    double neliot = sc.nextDouble();
    sc.nextLine();
    
    System.out.print("Anna huoneiden lukumaara: ");
    float huoneiden_lkm = sc.nextFloat();
    sc.nextLine();
    
    //rakennetaan talo
    rakennus = new Rakennus(neliot, huoneiden_lkm);
    tontti.setRakennusTontille(rakennus);

    //ilmoitetaan, etta talo rakennettiin
    System.out.println("\nRakennettiin talo tontille: \n" +  rakennus.toString());
    
    //kysellaan asukkaan tiedot
    System.out.print("\nAnna asukkaan nimi: ");
    String henkilo = sc.nextLine();
    
    //asukas muuttaa taloon
    asukas = new Asukas(henkilo);
    rakennus.setAsukas(asukas);
    
    //ilmoitetaan, etta asukas on muuttanut taloon
    System.out.println("\nTaloon muutti asukas: " + asukas.toString());
    }
}