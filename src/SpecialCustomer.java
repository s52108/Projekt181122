public class SpecialCustomer extends Customer {

    private String someAttribute;

    public SpecialCustomer(int customerNumber, String firstName, String lastName, String someAttribute) {
        super(customerNumber, firstName, lastName);
        this.someAttribute = someAttribute;
    }
}
