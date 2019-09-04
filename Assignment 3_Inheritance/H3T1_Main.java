import java.io.*;
import java.util.Scanner;
import java.util.Locale;

public class H3T1_Main {
   
   private static Scanner lukija = new Scanner(System.in).useLocale( new Locale("us", "US") ); //windows saattaa muuten vaatia desimaalipisteen sijaan desimaalipilkkua

   public static void main( String [] args ){
    Product tavara = new Product("Kuorintavoide", 12.50);
	ProductInfo pinfo = new ProductInfo(tavara, "Kosteuttava");
	ProductInfo jinfo = new ProductInfo("Jalkavoide", 15.00, "Laventeli" );
	pinfo.print();
	jinfo.print();
   }
}