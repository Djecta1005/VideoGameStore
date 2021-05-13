public class Customer {
    private int CustomerID;
    private String name;
    private int accountBalance;

    public Customer(int customerID, String name, int accountBalance) {
        CustomerID = customerID;
        this.name = name;
        this.accountBalance = accountBalance;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

}
