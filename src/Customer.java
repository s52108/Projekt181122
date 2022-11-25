import java.util.ArrayList;

public class Customer extends Person {

    private int customerNumber;
    private ArrayList<Address> addresses = new ArrayList<>();

    public Customer(int customerNumber, String firstName, String lastName) {
        super(firstName, lastName);
        this.customerNumber = customerNumber;

    }

    public String print() {
        return customerNumber + ";" + super.print();

    }

    public void add(Address address) {
        addresses.add(address);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", firstname=" + getFirstname() +
                ", lastname=" + getLastname() +
                ", addresses=" + addresses +
                '}';
    }
}
