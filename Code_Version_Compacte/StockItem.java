public class StockItem {
    private int itemID;
    private float rentalprice;
    private String title;

    public StockItem(int itemID, float rentalprice, String titre) {
        this.itemID = itemID;
        this.rentalprice = rentalprice;
        this.title = titre;
    }
    public StockItem(int itemID, String titre) {
        this.itemID = itemID;
        this.title = titre;
    }

    public int getItemID() {
        return this.itemID;
    }
    public float getRentalprice() {
        return this.rentalprice;
    }
    public String getTitle() {
        return this.title;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setRentalprice(float rentalprice) {
        this.rentalprice = rentalprice;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
