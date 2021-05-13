import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class QueryProcessor {
    private HashMap<String, Customer> Customers = new HashMap<String, Customer>();
    private HashMap<String, StockItem> StockItems = new HashMap<String, StockItem>();
    private ArrayList<RentedItem> RentedItems = new ArrayList<RentedItem>();

    public QueryProcessor(HashMap<String, Customer> customers, HashMap<String, StockItem> stockItems, ArrayList<RentedItem> rentedItems) {
        Customers = customers;
        StockItems = stockItems;
        RentedItems = rentedItems;
    }

    public HashMap<String, Customer> getCustomers() {
        return Customers;
    }

    public void setCustomers(HashMap<String, Customer> customers) {
        Customers = customers;
    }

    public HashMap<String, StockItem> getStockItems() {
        return StockItems;
    }

    public void setStockItems(HashMap<String, StockItem> stockItems) {
        StockItems = stockItems;
    }

    public ArrayList<RentedItem> getRentedItems() {
        return RentedItems;
    }

    public void setRentedItems(ArrayList<RentedItem> rentedItems) {
        RentedItems = rentedItems;
    }
    public boolean FindByTitle(String title)
    {
        return  StockItems.containsKey(title);
    }
    public ArrayList<Film> NdByActor(String Actor)
    {
        Iterator<Map.Entry<String, StockItem>> itr = StockItems.entrySet().iterator();
        ArrayList<Film> films = new ArrayList<Film>();
        while(itr.hasNext())
        {

            Map.Entry<String, StockItem> entry = itr.next();
            if((entry.getValue().getClass().getSimpleName().compareTo("Film")==0) &&(((Film)entry.getValue()).getActor().compareTo(Actor)==0))
            {
                films.add((Film) entry.getValue());
            }
        }
        return films;
    }
    public boolean IsCheckedOut(StockItem Item)
    {
        return RentedItems.contains(Item);
    }
    public int Solde(Customer cust)
    {
        return cust.getAccountBalance();
    }
    public ArrayList<StockItem> OverdueItems()
    {
        ArrayList<StockItem> Items = new ArrayList<StockItem>();
        for(int i=0; i<RentedItems.size(); i++)
            if(RentedItems.get(i).getDueDate().isBefore(LocalDate.now()))
            {
                Items.add(RentedItems.get(i).getItemID());
            }

        return Items;
    }
}
