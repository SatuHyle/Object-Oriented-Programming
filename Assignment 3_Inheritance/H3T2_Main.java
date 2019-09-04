import java.io.*;
import java.util.Scanner;
import java.util.Locale;

public class H3T2_Main {
   
   private static Scanner lukija = new Scanner(System.in).useLocale( new Locale("us", "US") ); //windows saattaa muuten vaatia desimaalipisteen sijaan desimaalipilkkua

   public static void main( String [] args ){
		RandTable rtable = new RandTable(20, 100);
		int luku = 1;
		do{
			luku = rtable.nextNumber();
			System.out.println(luku);
		}while(luku >= 1);	
      
   }





}