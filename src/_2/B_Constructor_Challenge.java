package _2;

public class B_Constructor_Challenge
{
    public static void main(String[] args) {
        Customer customer = new Customer("Tim",1000,"tim@email.com");
        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Bala","Bala@email.com");

        System.out.println(customer.getAddress()+"\n"+customer.getName()+"\n"+customer.getCreditLimit());
        System.out.println(customer1.getAddress()+"\n"+customer1.getName()+"\n"+customer1.getCreditLimit());
        System.out.println(customer2.getAddress()+"\n"+customer2.getName()+"\n"+customer2.getCreditLimit());
    }
}
class Customer
{
    String name;
    double creditLimit;
    String address;

    public Customer(String name, double creditLimit, String address) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.address = address;
    }

    public Customer() {
        this("Default Name","Default Address");
    }

    public Customer(String name, String address) {
        this(name,10000.0,address);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getAddress() {
        return address;
    }

}
