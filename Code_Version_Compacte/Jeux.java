public class Jeux extends StockItem{
    private String plateforme;

    public Jeux(int intemID, float rentalprice, String titre ,String plateforme) {
        super(intemID, rentalprice, titre);
        this.plateforme = plateforme;
    }

    public String getPlateforme() {
        return plateforme;
    }

    public void setPlateforme(String plateforme) {
        this.plateforme = plateforme;
    }
}
