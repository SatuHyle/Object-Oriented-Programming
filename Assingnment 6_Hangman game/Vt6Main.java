import java.util.Iterator;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vt6Main{

    public static void main(String[] args){

        String tiedoston_nimi = "Sanalista.txt";
        int arvausten_maara = 7;
        Character kirjain;
        int valinta = 0;

        Sanalista sanalista = new Sanalista(tiedoston_nimi);
		Hirsipuu hirsipuu = new Hirsipuu(sanalista, arvausten_maara);

        do{
            System.out.println("\nPelaat hirsipuupelia");
            tulostaValikko ();
            valinta = lueInt(); 
            
            switch ( valinta ){
                case 1:
                    System.out.print("Anna haluamasi kirjain: ");
                    kirjain = lueKirjain();
                  if(hirsipuu.arvaa(kirjain)){
                    System.out.println("ARVAUKSET: "  + hirsipuu.arvaukset().toString());
                    System.out.println("OIKEIN");
                    if( hirsipuu.onLoppu()){
                        System.out.println("VOITIT");
                        
                    }
                     
                }else {
                    System.out.println("VAARIN");
                    System.out.println("ARVAUKSIA JALJELLA: " + hirsipuu.arvauksiaOnJaljella());
                }
                    break;

                case 0:
                    System.out.print("Lopetit pelin.");
                    break;
                   
                default:
                    System.out.print("Vaara valinta. Yrita uudelleen.");
            }
             
        }while ( valinta != 0 && !hirsipuu.onLoppu());
    }

    public static void tulostaValikko() {
        System.out.println("\n\n 1) Arvaa uusi kirjain");
        System.out.println(" 0) Lopeta peli");
        System.out.print("\nValintasi > ");
    }
    
    public static Character lueKirjain(){
        Scanner sc = new Scanner(System.in);
        boolean ok = false;
        Character kirjain = null;
         
        do {
            
           try {
              kirjain = sc.next().charAt(0);
              sc.nextLine();
              ok = true;
           }catch( InputMismatchException ime ){
              sc.nextLine();
              System.out.print("Virhe, yrita uudelleen > ");
           }
            
        }while(!ok);
         
        return kirjain;  
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
}
