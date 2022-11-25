public class Demo {

    public static void main(String[] args) {

        Customer c = new Customer(1,"Susi", "Sorglos");
       // c.setFirstname("Susi");
      //  c.setLastname("Sorglos");

        c.add(new Address("Grazerstraße 1", "Graz", "8010", "Country"));

        System.out.println(c.toString());

        String value = c.print();
        System.out.println("value = " + value);

    }

}