import java.io.*;
import java.util.Scanner;

class TonttiMain {

    private static Scanner sc = new Scanner( System.in );

    public static void main( String [] args ){

    //muuttujat
    Tontti tontti = null;
    Tontti tontti1 = null;
    Tontti tontti2 = null;
    Rakennus kerrostalo = null;
    Rakennus rivitalo = null;
    Rakennus omakotitalo = null;
    Asukas asukas = null;
    Asukas asukas1 = null;
    Asukas asukas2 = null;
    
    //RAKENNETAAN KERROSTALO------------------------------------------------------
    //kysellaan tiedot tonttia varten
    System.out.print("Rakennetaan ensin kerrostalo.\n");
    System.out.print("Anna tontin nimi: ");
    String nimi = sc.nextLine();
    
    System.out.print("Anna tontin sijainti: ");
    String sijainti = sc.nextLine();
    
    System.out.print("Anna tontin pinta-ala: ");
    double pinta_ala = sc.nextDouble();
    sc.nextLine();
    
    //rakennetaan tontti
    tontti = new Tontti(nimi, sijainti, pinta_ala);
    tontti.tulosta();

    //ilmoitetaan, etta tontti luotiin
    System.out.println("\nPystytettiin tontti: " +  tontti.toString());
    
    //kysellaan kerrostalon tiedot
    System.out.print("\nAnna kerrostalon pinta-ala: ");
    double neliot = sc.nextDouble();
    sc.nextLine();
    
    System.out.print("Anna huoneiden lukumaara: ");
    float huoneiden_lkm = sc.nextFloat();
    sc.nextLine();

    System.out.print("Anna asuntojen lukumaara: ");
    float asuntojen_lkm = sc.nextFloat();
    sc.nextLine();

    //rakennetaan kerrostalo
    kerrostalo = new Kerrostalo(neliot, huoneiden_lkm, asuntojen_lkm);
    tontti.setRakennusTontille(kerrostalo);

    //ilmoitetaan, etta kerrostalo rakennettiin
    System.out.println("\nRakennettiin rakennus tontille: \n" +  kerrostalo.toString());
    
    //kysellaan asukkaan tiedot
    System.out.print("\nAnna asukkaan nimi: ");
    String henkilo = sc.nextLine();
    
    //asukas muuttaa taloon
    asukas = new Asukas(henkilo);
    kerrostalo.setAsukas(asukas);
    
    //ilmoitetaan, etta asukas on muuttanut taloon
    System.out.println("\nTaloon muutti asukas: " + asukas.toString());

    //tulostetaan kaikki tiedot
    tontti.tulosta();
    kerrostalo.tulosta();
    asukas.tulosta();

    //RAKENNETAAN RIVITALO--------------------------------------------------
    //kysellaan tiedot tonttia varten
    System.out.print("\n Rakennetaan toiseksi rivitalo.\n");
    System.out.print("Anna tontin nimi: ");
    String nimi1 = sc.nextLine();
    
    System.out.print("Anna tontin sijainti: ");
    String sijainti1 = sc.nextLine();
    
    System.out.print("Anna tontin pinta-ala: ");
    double pinta_ala1 = sc.nextDouble();
    sc.nextLine();
    
    //rakennetaan tontti
    tontti1 = new Tontti(nimi1, sijainti1, pinta_ala1);
    tontti1.tulosta();

    //ilmoitetaan, etta tontti luotiin
    System.out.println("\nPystytettiin tontti: " +  tontti1.toString());
    
    //kysellaan rivitalon tiedot
    System.out.print("\nAnna rivitalon pinta-ala: ");
    double neliot1 = sc.nextDouble();
    sc.nextLine();
    
    System.out.print("Anna huoneiden lukumaara: ");
    float huoneiden_lkm1 = sc.nextFloat();
    sc.nextLine();

    System.out.print("Anna asuntojen lukumaara: ");
    float asuntojen_lkm1 = sc.nextFloat();
    sc.nextLine();

    //rakennetaan rivitalo
    rivitalo = new Rivitalo(neliot1, huoneiden_lkm1, asuntojen_lkm1);
    tontti1.setRakennusTontille(rivitalo);

    //ilmoitetaan, etta rivitalo rakennettiin
    System.out.println("\nRakennettiin rakennus tontille: \n" +  rivitalo.toString());
    
    //kysellaan asukkaan tiedot
    System.out.print("\nAnna asukkaan nimi: ");
    String henkilo1 = sc.nextLine();
    
    //asukas muuttaa taloon
    asukas1 = new Asukas(henkilo1);
    rivitalo.setAsukas(asukas1);
    
    //ilmoitetaan, etta asukas on muuttanut taloon
    System.out.println("\nTaloon muutti asukas: " + asukas1.toString());

    //tulostetaan kaikki tiedot
    tontti1.tulosta();
    rivitalo.tulosta();
    asukas1.tulosta();

    //RAKENNETAAN OMAKOTITALO--------------------------------------------------
    //kysellaan tiedot tonttia varten
    System.out.print("\n Rakennetaan kolmanneksi omakotitalo.\n");
    System.out.print("Anna tontin nimi: ");
    String nimi2 = sc.nextLine();
    
    System.out.print("Anna tontin sijainti: ");
    String sijainti2 = sc.nextLine();
    
    System.out.print("Anna tontin pinta-ala: ");
    double pinta_ala2 = sc.nextDouble();
    sc.nextLine();
    
    //rakennetaan tontti
    tontti2 = new Tontti(nimi2, sijainti2, pinta_ala2);
    tontti2.tulosta();

    //ilmoitetaan, etta tontti luotiin
    System.out.println("\nPystytettiin tontti: " +  tontti2.toString());
    
    //kysellaan rivitalon tiedot
    System.out.print("\nAnna rivitalon pinta-ala: ");
    double neliot2 = sc.nextDouble();
    sc.nextLine();
    
    System.out.print("Anna huoneiden lukumaara: ");
    float huoneiden_lkm2 = sc.nextFloat();
    sc.nextLine();

    //rakennetaan rivitalo
    omakotitalo = new Omakotitalo(neliot2, huoneiden_lkm2);
    tontti1.setRakennusTontille(omakotitalo);

    //ilmoitetaan, etta rivitalo rakennettiin
    System.out.println("\nRakennettiin rakennus tontille: \n" +  omakotitalo.toString());
    
    //kysellaan asukkaan tiedot
    System.out.print("\nAnna asukkaan nimi: ");
    String henkilo2 = sc.nextLine();
    
    //asukas muuttaa taloon
    asukas2 = new Asukas(henkilo2);
    omakotitalo.setAsukas(asukas2);
    
    //ilmoitetaan, etta asukas on muuttanut taloon
    System.out.println("\nTaloon muutti asukas: " + asukas2.toString());

    //tulostetaan kaikki tiedot
    tontti2.tulosta();
    omakotitalo.tulosta();
    asukas2.tulosta();
    }
}