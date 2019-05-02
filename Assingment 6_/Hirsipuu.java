import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Hirsipuu{
    private String sana;
	private int arvausten_max_maara;
	private int arvausten_maara;
	private List<Character> arvatut_kirjaimet;
    private char[] aukaistut_kirjaimet;
    Sanalista sanalista;
    
    //konstruktori
    public Hirsipuu(Sanalista sanalista, int arvausten_maara_par){
		arvausten_max_maara = arvausten_maara_par;
        arvausten_maara = 0; //alussa
        
		//valitaan arpomalla sanalistan sana
		Random random = new Random();
		List<String> annaSanat = sanalista.annaSanat();
		sana = annaSanat.get(random.nextInt(annaSanat.size()));
		aukaistut_kirjaimet = new char[sana.length()];
       arvatut_kirjaimet = new ArrayList<>();
		for(int i = 0; i < sana.length(); i++){
			if(sana.charAt(i) == '-'){
				aukaistut_kirjaimet[i] = '-';
			}else{
				aukaistut_kirjaimet[i] = '*';
			}
		}
    }
    
    //metodit
    public boolean arvaa(Character merkki){
		boolean onnistui = false;
       
       if( sana.contains(merkki.toString()))
          arvatut_kirjaimet.add(merkki);
       
       System.out.println("ARVATTAVA ON :" + sana);
		for(int i = 0; i < aukaistut_kirjaimet.length; i++){
			if(sana.charAt(i) == (char)Character.toLowerCase(merkki)){
				aukaistut_kirjaimet[i] = merkki;
            
            
            
            System.out.println("AUKAISTUT KIRJAIMET: " +new String(aukaistut_kirjaimet));
				onnistui = true;
			}
		}
		
		if(!onnistui)
			arvausten_maara++;
		
		return onnistui;
    }

    //palauttaa tehdyt arvaukset lista olioina
    public List<Character> arvaukset(){
		return arvatut_kirjaimet;
    }
    
    //palauttaa jaljella olevien arvausten maaran
    public int arvauksiaOnJaljella(){
		return arvausten_max_maara - arvausten_maara;
    }
    
    //palauttaa arvattavan sanan peittelemattomana
    public String sana(){
		return sana;
    }

    //ilmaisee onko peli loppu
	public boolean onLoppu(){
		for(int i = 0; i < aukaistut_kirjaimet.length; i++){
			if(aukaistut_kirjaimet[i] == '*')
				return false;
		}
		return true;
    }
    
    //asetusmetodit
    public void setSana(String sana_par){
        sana = sana_par;
    }

    public void setArvausten_max_maara(int arvausten_max_maara_par){
        arvausten_max_maara = arvausten_max_maara_par;
    }

    public void setArvausten_maara(int arvausten_maara_par) {
		arvausten_maara = arvausten_maara_par;
    }
    
	public void setAukaistut_kirjaimet(char[] aukaistut_kirjaimet_par) {
		aukaistut_kirjaimet = aukaistut_kirjaimet_par;
    }
    
    //saantimetodit
    public String getSana(){
        return sana;
    }

    public int getArvausten_maara(){
        return arvausten_maara;
    }

    public int getArvausten_max_maara(){
        return arvausten_max_maara;
    }
    public char[] getAukaistut_kirjaimet(){
        return aukaistut_kirjaimet;
    }
}
