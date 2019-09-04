import java.io.*;
import java.util.*;

public class Sanalista {

    private List<String> annaSanat;

    //metodi
    public Sanalista(String tiedoston_nimi_par){
        
        annaSanat = new ArrayList<String>();
        String rivi;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(tiedoston_nimi_par), "utf-8"));

            rivi = br.readLine();
            while(rivi != null){
                annaSanat.add(rivi);
                rivi = br.readLine();
            }

            br.close();
        } catch (IOException e){
            e.printStackTrace();
            System.exit(0);
        }
    }

    //asetusmetodi
    public Sanalista(List<String> annaSanat_par){
        annaSanat = annaSanat_par;
    }

    //saantimetodi
    public List<String> annaSanat(){
        return annaSanat;
    }

    //bonusmetodit
    public Sanalista sanatJoidenPituusOn(int pituus){
		List<String> siivottuLista = new ArrayList<String>();
		for(String sana : annaSanat){
			if(sana.length() == pituus)
				siivottuLista.add(sana);
		}
		
		return new Sanalista(siivottuLista);
    }
}