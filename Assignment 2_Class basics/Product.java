public class Product{
	//attribuutit
	private String name;
	private double price;
	
	//metodit
	public void setName(final String name){
		
	}
	public void setPrice(final double price){
		
	}
	public String getName(){
		return name;	
	}
	public double getPrice(){
		return price;
	}
	//konstruktori
	public Product(final String name_par, final double price_par){
		name = name_par;
		price = price_par;
	}
}