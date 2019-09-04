import java.io.*;
import java.util.Scanner;

class ProductTesti {
	
	//metodit
	static void printProduct(final Product prod){
		
		String nimi;
		double hinta;
		
		nimi = prod.getName();
		hinta = prod.getPrice();
		
		System.out.println("Tuotteen " + nimi + " hinta on " + hinta);
	}
	
	static Product readProduct(){
		//jokainen luokka on tyyppi eli tassa on luotu tietotyyppi Product
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna tuotteen nimi:");
		String nimi = lukija.nextLine();
		System.out.println("Annan tuotteen hinta:");
		double hinta = lukija.nextDouble();
		Product tuote = new Product (nimi, hinta);
		return tuote;
	}
	
	static void readProducts(Product [] products){		
		for(int i=0; i<products.length; i++){
			products[i] = readProduct();
		}
	}	
	static void printProducts(Product [] products){
		for(int i=0; i<products.length; i++){
			printProduct(products[i]);
		}		
	}	
	
	//paaohjelma
	public static void main(String [] args){
		 
		Product lopputuote = readProduct();
		printProduct(lopputuote);
		
		Scanner lukija = new Scanner(System.in);
		System.out.println("Annan tuotteiden lukumaara:");
		
		int lkm = lukija.nextInt();
		Product [] taulu = new Product[lkm];
		readProducts(taulu);
		printProducts(taulu);	

	}
}	