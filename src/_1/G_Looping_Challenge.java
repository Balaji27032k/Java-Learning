package _1;

public class G_Looping_Challenge
{
    public static void main(String[] args) {
//        System.out.println("0 is "+(isPrime(0)?"":"NOT ")+"a prime number");
//        System.out.println("1 is "+(isPrime(1)?"":"NOT ")+"a prime number");
//        System.out.println("2 is "+(isPrime(2)?"":"NOT ")+"a prime number");
//        System.out.println("3 is "+(isPrime(3)?"":"NOT ")+"a prime number");
//
//        System.out.println("8 is "+(isPrime(8)?"":"NOT ")+"a prime number");
//        System.out.println("17 is "+(isPrime(17)?"":"NOT ")+"a prime number");

        int counter=0;
        for(int i=10;counter < 3 && i<=50;i++)
        {
            if(isPrime(i))
            {
                System.out.println("number "+i+" is a prime number");
                counter++;
//                if(counter==3)
//                {
//                    System.out.println("Found 3 - Exiting for loop");
//                    break;
//                }
            }
        }

    }
    public static boolean isPrime(int wholeNumber)
    {
        if(wholeNumber<=2)
            return (wholeNumber==2);
        for(int divisor=2;divisor<=wholeNumber/2;divisor++) //divisor<wholeNumber
        {
            if(wholeNumber%divisor==0)
                return false;
        }
        return true;
    }
}
class ThreeAndFiveChallenge
{
    public static void main(String[] args)
    {
        int sum=0,counter=0;
        for (int i =1 ;counter<5 && i<=1000;i++)
        {
            if(i%3==0 && i%5==0)
            {
                sum+=i;
                counter++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nThe sum of numbers divisible by 3 and 5 are "+sum);
    }

}
class Looping_Statements
{
    public static void main(String[] args) {
        int number =0;//initialization

        while(number<50)//condition
        {
            number+=5;//increment or loop termination statement.
            if(number%25==0)
                continue;
            System.out.print(number+"_");
        }
    }
}
