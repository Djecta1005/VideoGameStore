import java.time.LocalDate;
import java.util.Date;

public class RentedItem {
    private Customer customerID;
    private StockItem itemID;
    private LocalDate dueDate;

    public RentedItem(Customer customerID, StockItem itemID, LocalDate dueDate) {
        this.customerID = customerID;
        this.itemID = itemID;
        this.dueDate = dueDate;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public StockItem getItemID() {
        return itemID;
    }

    public void setItemID(StockItem itemID) {
        this.itemID = itemID;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

}
