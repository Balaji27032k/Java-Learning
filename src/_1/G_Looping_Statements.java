package _1;

public class G_Looping_Statements
{
    public static void main(String[] args) {
        for(int counter = 1;counter<=5;counter++)
        {
            System.out.println(counter);
        }
//        System.out.println("10,000 at 2% interest = "+calculateInterest(10000.0,2.0));
//        System.out.println("10,000 at 3% interest = "+calculateInterest(10000.0,3.0));
//        System.out.println("10,000 at 4% interest = "+calculateInterest(10000.0,4.0));
//        System.out.println("10,000 at 5% interest = "+calculateInterest(10000.0,5.0));
        for(double rate=2.0;rate<=5.0;rate++)
        {
            double interestAmount = calculateInterest(10000,rate);
            System.out.println("10,000 at "+rate+"% interest = "+interestAmount);
        }
        for(double rate=7.5;rate<=10;rate+=0.25){
            System.out.println("100 at "+rate+"% interest = "+calculateInterest(100,rate));
        }

    }
    public static double calculateInterest(double amount ,double InterstRate){
        return (amount*(InterstRate/100));
    }
}
