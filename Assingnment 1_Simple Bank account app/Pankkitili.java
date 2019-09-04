import java.io.*;

public class Pankkitili{
	
	//attribuutit
	
	private String tilinumero;
	private String omistaja;
	private double saldo;
    private double summa;
	
	//konstruktori
    public Pankkitili(final String omistaja_par, final String tilinumero_par, final double saldo_par){
    omistaja = omistaja_par;
    tilinumero = tilinumero_par;
    saldo = saldo_par;  
	}
	
	//set-metodit
	
	public void setOmistaja(String omistaja){
		this.omistaja = omistaja;
	}

	public void setTilinumero(String tilinumero){
		this.tilinumero = tilinumero;
	}
	
	public void setSaldo(double saldo){
		if (saldo < 0){
			System.out.println("Saldo ei voi olla negatiivinen");
		}
		else{	
			this.saldo = saldo;
		}
	}
	
	//get-metodit
	
	public String getOmistaja( ){
		return this.omistaja;
	}
	
	public String getTilinumero( ){
		return this.tilinumero;
	}
	
	public double getSaldo( ){
		return this.saldo;
	}
	
	//muut metodit
	
	public double otto(double summa){
		if (summa > saldo){
			System.out.println("Ei riittavasti katetta.");
		} if (summa < 0){
                System.out.println("Nosto ei voi olla negatiivinen.");
        }
		else{
		saldo = saldo - summa;
		}
        return saldo;
	}
	
	public double talletus(double summa){
		if (summa < 0){
			System.out.println("Talletus ei voi olla negatiivinen");
		}
		else{
		saldo = saldo + summa;
		}
        return saldo;
	}
	public String toString(  ){
        return "Tilin haltija: " + this.omistaja + ". Tilinumero: " + this.tilinumero + ". Tilin saldo: " + this.saldo;
	}
} 	