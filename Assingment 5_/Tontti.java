public class Tontti {

    //muuttujat
    private String nimi;
    private String osoite;
    private double pinta_ala;
    private Rakennus rakennus;

    //tilanne ennen kuin tonttia on luotu
    public Tontti(){
        nimi = " ";
        osoite = " ";
        pinta_ala = 0.0;
        rakennus = null;
    }

    //muodostin
    public Tontti(String nimi_par, String osoite_par, final double pinta_ala_par){
        nimi = nimi_par;
        osoite = osoite_par;
        pinta_ala = pinta_ala_par;
        rakennus = null;
    }

    public void setRakennusTontille(Rakennus r){
        rakennus = r;
    }

    public Rakennus getRakennusTontilta(){
        return new Rakennus();
    }

    public boolean setAsukasRakennukseen(Asukas ihminen ){
        return rakennus.setAsukas(ihminen);
    }

    public Asukas getAsukasRakennuksesta(){
        return rakennus.getAsukas();
    }

    public String toString(){
        if(rakennus != null ) //jos tontilla on rakennus, tulosta...
            return ("\nTontin nimi: " + nimi + ", osoite: " + osoite + ", pinta-ala: " + pinta_ala + rakennus.toString());
        else //jos tontilla ei ole rakennusta, tulosta...
            return ("\nTontin nimi: " + nimi + ", osoite: " + osoite + ", pinta-ala: " + pinta_ala + "\nTontilla ei ole rakennusta");
   }
}