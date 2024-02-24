package Loops;

public class Loop_Challenge
{
    /*
    step 1. create a method called isEvenNumber, that takes a parameter of type int.
    it's purpose is to determin if the argument passed to the method is an even number or not.

    return true from the method,it it's an even number, otherwise return false.

    Next, use a while loop to test a range of number from 5 upto and including 20 ,but printing out only even numbers,
    determined by the call to the isEvenNumber method.
     */
    public static void main(String[] args)
    {
        System.out.println(sumDigits(-10045));
    }
    //Challenge 1
    public static boolean isEvenNumber(int number)
    {
        if(number%2==0)
        {
            return true;
        }
        return false;
    }
    public static void printValueEven()
    {
        int i=4;
        int evenCount=0,oddCount=0;
        while (i<=20)
        {
            i++;
            if(!isEvenNumber(i))
            {
                oddCount++;
                continue;
            }
            System.out.println(i);
            evenCount++;
            if (evenCount>=5)
                break;
        }
        System.out.println("Even count = "+evenCount+" Odd count = "+oddCount);
    }
    //Challenge 2
    public static int sumDigits(int num)
    {
        int temp,sum=0;
        if(num>0)
        {
            while(true)
            {
                temp=num%10;
                num=num/10;
                sum+=temp;
                if(num==0)
                    return sum;
            }

        }
        return -1;
    }
}
