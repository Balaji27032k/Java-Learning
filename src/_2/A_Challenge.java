package _2;

public class A_Challenge
{
    public static void main(String[] args) {
        bankAccount bobsAccount = new bankAccount("12345",1000.00,"Bob Brown","myemail@bob.com","(001) 123-4567");
        bankAccount bob = new bankAccount();
//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setAccountBalance(1000.0);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setEmail("myemail@bob.com");
//        bobsAccount.setPhonenumber("(087) 123-4567");
        System.out.println(bobsAccount.getCustomerName()+"\n"+ bobsAccount.getPhonenumber());
        /*bobsAccount.withdraw(100.0);
        bobsAccount.deposit(250);
        bobsAccount.withdraw(50);
        bobsAccount.withdraw(200);
        bobsAccount.deposit(100);
        bobsAccount.withdraw(45.55);
        bobsAccount.withdraw(54.46);
        bobsAccount.withdraw(54.45);*/

        bankAccount timsAccount = new bankAccount("Tim","tim@email.com","12345");
        System.out.println("AccountNo: "+timsAccount.getAccountNumber()+"; name "+timsAccount.getCustomerName());
    }
}
class bankAccount
{
    /*
    Firstly,it turns out that a constructor is created for us implicitly by java.When I say things are implicitly in java
    I mean we can't see the code in the source,but it's in the bytecode,generated during the compilation process.
    So,when you actually type new,and the name of the class with the parenthesis,this is actually calling that implicit
    constructor.I didn't explicitly create a constructor in the bankAccount class,so Java created one for me.This is called
    default constructor.
     */
    private double accountBalance;
    private String accountNumber,customerName,email,phonenumber;

    public bankAccount()
    {
        this("56789",2.50,"Default name","Default address","Default phone");
        System.out.println("Empty Constructor called");
        /*
        What I am doing here is ,look "if you try and create an object from this class and you don't give me any
        arguments,set this new object up with these values by calling the specified constructor"
        Refer constructor chaining in OOPs notes.
         */
    }
    public bankAccount(String accountNumber,double accountBalance,String customerName,String email,String phonenumber)
    {
        System.out.println("Account constructor with parameters called ");
        //this.accountNumber=accountNumber;
        setAccountNumber(accountNumber);
        /*
        As you can see,I can assign the values directly to the constructor.I could've done something like using setNumber();
        to set the values.There are conflicting opinions as to which is the best approach.Because you'll find out when we talking
        about inheritance and creating subclasses,these calls to setter methods might not work.The general rule of thumb is,
        it's always better to assign the values directly to the field,rather than calling the setter in a constructor.
        Because as you'll see in the next video,and as I just mentioned,there can be scenarios where this code that's in this
        setter isn't executed.
        My general rule of thumb with constructors is,don't call setters or any method other than another constructor,within
        those constructors.
         */
        this.accountBalance=accountBalance;
        this.customerName=customerName;
        this.email=email;
        this.phonenumber=phonenumber;
    }

    public bankAccount(String customerName,String email, String phonenumber) {
        this("9999",100.55,customerName,email,phonenumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void deposit(double money)
    {
        setAccountBalance(getAccountBalance()+money);
        System.out.println("Deposit of $"+money+" made. New balance is $"+getAccountBalance());
    }
    public void withdraw(double money)
    {
        if (((getAccountBalance() - money) < 0)) {
            System.out.println("Insufficient Funds! You only have $" + getAccountBalance() + " in your account.");
        } else {
            setAccountBalance(getAccountBalance()-money);
            System.out.println("Withdrawl of $"+money+" made.Remaining balance is $"+getAccountBalance()+" in your account.");
        }
    }
}
