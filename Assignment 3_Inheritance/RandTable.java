import java.util.Random;

public class RandTable {
  
   //attribuutit
   private int maxNum;
   private int curPos;
   private int[] table;
   
   //konstruktorit eli muodostimet
	public RandTable(final int size, final int max){
		table = new int[size]; // luodaan uusi taulukko, jonka koko on size
		curPos = 0;	//antaa taulukon nykyisen indeksin
		maxNum = max;	//arvottavien kokonaislukujen maksimiarvo
		//arvotaan satunnaisluvut taulukkoon
		Random r = new Random(); // luo uuden satunnaislukugeneraattorin (niin kuin scanner)	
			for (int i = 0; i < table.length; i++){
				table[i] = r.nextInt(maxNum) + 1; //sijoitetaan taulukkoon satunnaisluvut
			}			
   }
   
   //metodit
	public int nextNumber(){ 
		if (curPos >= table.length) // jos curPos ylittaa taulukon pituuden, palautetaan -1
			return -1;
		int tulos = table[curPos]; //tulos = taulukon luku indeksin kohdassa curPos 
		curPos++; // kasvatetaan indeksia yhdella
		return tulos;
	}

}


