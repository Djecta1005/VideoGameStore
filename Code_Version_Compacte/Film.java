public class Film extends StockItem{
    private String acteur;

    public Film(int intemID, float rentalprice, String titre ,String acteur) {
        super(intemID, rentalprice, titre);
        this.acteur = acteur;
    }

    public String getActeur() {
        return acteur;
    }

    public void setActeur(String acteur) {
        this.acteur = acteur;
    }
}
