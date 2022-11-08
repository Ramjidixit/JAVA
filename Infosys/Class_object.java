class Customer {
    public String customerId;
    public String customerName;
    public long contactNumber;
    public String address;

    public void displayCustomerDetails() {
        System.out.println("Displaying custimer Details");
        System.out.println("Customer Id:" + customerId);
        System.out.println("customer name=" + customerName);
        System.out.println("contact number=" + contactNumber);
        System.out.println("Address=" + address);
    }
}

public class Class_object {
    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.customerId = "c101";
        cust.customerName = "radha";
        cust.contactNumber = 7896325L;
        cust.displayCustomerDetails();

    }
}
/*
 * Displaying custimer Details
 * Customer Id:c101
 * customer name=radha
 * contact number=7896325
 * Address=null
 */
