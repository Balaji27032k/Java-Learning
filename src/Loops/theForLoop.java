package Loops;
/*
The for loop is more complex to set up but is commonly used when you are iterating over a set of values.
for(inti; expression; increment){
    //block of statements
}
These parts are all optional and consist of the following
* The initialization section declares or sets state,usually declaring and initializing a loop variable, before the loop
begins processing.
* The expression section, once it becomes false ,it ends the loop processing.
* The increment section is executed after the expression is tested, and is generally the place where the loop variable
is incrementd.
 */
public class theForLoop
{
    public static void main(String[] args) {
        //System.out.println("10000 at 2% Interest is "+calculateInterestRate(10000,2));
        /*for (int counter=1; counter<=5; counter++)
        {
            //System.out.println(counter);
            System.out.println("10000 at "+counter+"% Interest is "+calculateInterestRate(10000,counter));
        }*/
        for (double i =7.5 ;i<=10.0;i+=0.25)
        {
            if(i>8.5)
                break;
            System.out.println("100 at "+i+"% Interest is "+calculateInterestRate(100,i));
        }
    }
    public static double calculateInterestRate(double amount,double InterestRate)
    {
            return amount*InterestRate/100;
    }
}
