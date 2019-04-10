public class Property{
    
    //attribuutit
    private String kiinteiston_tyyppi;
    private String sijaintipaikka;
    
    //konstruktori
    
    public Property(String kiinteiston_tyyppi_par, String sijaintipaikka_par){
        kiinteiston_tyyppi = kiinteiston_tyyppi_par;
        sijaintipaikka = sijaintipaikka_par;
    }
    
    //asetusmetodit
    public void setKiinteiston_tyyppi(String kiinteiston_tyyppi_par){
        kiinteiston_tyyppi = kiinteiston_tyyppi_par;
    }
    
    public void setSijaintipaikka(String sijaintipaikka_par){
        sijaintipaikka = sijaintipaikka_par;
    }
    
    //saantimetodit
    
    public String getKiinteiston_tyyppi(){
        return kiinteiston_tyyppi;
    }
    
    public String getSijaintipaikka(){
        return sijaintipaikka;
    }
    
    public String toString(){
        return "Kiinteiston tyyppi: " + kiinteiston_tyyppi + ", Sijaintipaikka: " + sijaintipaikka;
    }
}
