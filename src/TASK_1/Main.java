package TASK_1;
import java.util.ArrayList;
class Main{

    public static void main(String[] args) {
        ArrayList<Customer> customersDetails = new ArrayList<>();

        Customer Customer1 = new Customer("Ayman", "Freaky", "Zuhami");
        Customer Customer2 = new Customer("Mouse", "Gun", "MouseWithAGun");

        customersDetails.add(Customer1);
        customersDetails.add(Customer2);
        printCustomersDetails(customersDetails);

    }
public static void printCustomersDetails(ArrayList<Customer> customersDetails) {
        for (Customer customer : customersDetails) {
            System.out.println(customer.toString());
        }
}

}