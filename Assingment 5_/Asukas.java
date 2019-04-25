public class Asukas {

    private String nimi;

    //tilanne ennen kuin ihminen on muuttanut taloon
    public Asukas(){
        nimi = null;
    }

    public Asukas(Asukas ihminen){
        nimi = ihminen.nimi;
    }

    //muodostin
    public Asukas(String nimi_par){
        nimi = nimi_par;
    }

    public Asukas getAsukas(){
        return new Asukas(nimi);
    }

    //asetusmetodit
    public void setNimi(String nimi_par){
        nimi = nimi_par;
    }

    //saantimetodi
    public String getNimi(){
        return nimi;
    }

    public String toString(){
        return "Talossa asuu " + nimi;
    }
    public void tulosta(){
        System.out.println("Talossa asuu " + nimi);
    }
}