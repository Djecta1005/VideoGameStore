import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;

public class TransactionProcessor {
    ArrayList<RentedItem> RentedItems = new ArrayList<RentedItem>();
    HashMap<String, Customer> Clients = new HashMap<String, Customer>();
    HashMap<String, StockItem> StockItems = new HashMap<String, StockItem>();

    public TransactionProcessor(ArrayList<RentedItem> rentedItems, HashMap<String, Customer> Clients, HashMap<String, StockItem> StockItems) {
        this.Clients = Clients;
        this.StockItems = StockItems;
        this.RentedItems = rentedItems;
    }
    public HashMap<String, Customer> getClients(){
        return this.Clients;
    }
    public HashMap<String, StockItem> getStockItems(){
        return this.StockItems;
    }

    public boolean AddStockItem(StockItem article) {
        String title = article.getTitle();

        if (this.StockItems.put(title, article) == null) {
            return true;
        } else {
            return false;
        }
    }
    public boolean AddCustomer(Customer customer) {
        String nom = customer.getNom();

        if (this.Clients.put(nom, customer) == null) {
            return true;
        } else {
            return false;
        }
    }
    public boolean CheckOut(StockItem article, Customer client, Date date){ //Louer un article a un client

        int customerID = client.getCustomerID();
        String title = article.getTitle();
        RentedItem articleloue = new RentedItem(article.getItemID(),customerID, date );
        if (StockItems.containsKey(title)){
            if (!Clients.containsKey(client.getNom())){
                this.AddCustomer(client);
            }
            StockItems.remove(title);
            return RentedItems.add(articleloue);
        }
        else{
            return false;
        }
    }
    public boolean CheckIn(RentedItem articleloue, Date dateretour){ // Retour d'un article par un client donné à une date donnée
    //On doit d'abord vérifier si cet article n'est pas en retard, on utilise s'il appartient OverdueItems() (mais je pense ca sera dans la main)
        //int clientId = articleloue.getCustomerID();

        if (RentedItems.indexOf(articleloue) >= 0){
           return RentedItems.remove(articleloue);
           //On doit ajouter cet article au stock
        }
        else {
            return false;
        }
    }
}
