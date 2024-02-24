package Loops;

public class PrimePgm
{
    public static void main(String[] args) {
        System.out.println(isPrime(1)+" ");
        int count=0;
        for (int i= 0;i<=1000;i++)
        {
            if(isPrime(i))
            {
                //System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
        count=0;
        for(int j=1;j<=1000;j++)
        {
            if((j%3==0) && (j%5==0))
            {
                count+=j;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int WholeNumber)
    {
        if(WholeNumber<=2)
        {
            return (WholeNumber==2);
        }
        for(int divisor=2;divisor<=WholeNumber/2;divisor++)
        {
            if(WholeNumber%divisor==0)
            {
                return false;
            }
        }
        return true;
    }
}
