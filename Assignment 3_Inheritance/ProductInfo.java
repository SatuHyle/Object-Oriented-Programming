public class ProductInfo {

   //attribuutit
	private Product tuote;
	private String seloste;

   //konstruktorit eli muodostimet
	public ProductInfo(final Product prod, final String info){
		tuote = prod;
		seloste = info;
	}
	
	public ProductInfo (final String nimi, final double hinta, String info){
		seloste = info;	
		tuote = new Product (nimi, hinta); // 
	}
	

   //metodit
	public void setTuote(final Product tuote_par){
		tuote = tuote_par;
	}	
	
	public void setSeloste(final String seloste_par){
		seloste = seloste_par;
	}
	
	public Product getTuote(){
		return tuote;
	}
	
	public String getseloste(){
		return new String(seloste);
	}
	public void print(){
		System.out.println("Tuote: " + tuote.getName());
		System.out.println("Hinta: " + tuote.getPrice());
		System.out.println("Seloste: " + seloste);
	}

}
