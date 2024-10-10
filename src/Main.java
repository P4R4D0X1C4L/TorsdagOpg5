import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Jesper", "Kock", "P4R4D0X1C4L");    // Instantiates first customer

        ArrayList <Customer> customers = new ArrayList<>(); // Declaring an ArrayList called customers, hold elements of teh datatype Customer
        customers.add(customer);    // Adding the first customer to the customers ArrayList

        Customer customer2 = new Customer("Johan", "Jacobsen", "Devoid"); // Instantiates second customer
        customers.add(customer2);   // Adding the second customer to the customers ArrayList

        Customer customer3 = new Customer("Anders", "Thranum", "Thranum");  // // Instantiates third customer
        customers.add(customer3);   // Adding the third customer to the customers ArrayList

        printCustomers(customers);
    }
    public static void printCustomers(ArrayList <Customer> customers){
        for(Customer client : customers){   // Iterating through the customers ArrayList
            System.out.println(client);     // Printing each customer's data by using the toString method I overwrote in my Customer class
        }
    }
}

