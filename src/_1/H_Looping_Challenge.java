package _1;

public class H_Looping_Challenge
{
    public static void main(String[] args) {
        int num=4,count=0;
        while(num<=20 && count<5)
        {
            num++;
            if(!isEvenNumber(num))
                continue;
            System.out.println("Even Number  : "+num);
            count++;
        }
        System.out.println("The count is "+count);
    }
    public static boolean isEvenNumber(int number)
    {
        if(number%2==0)
            return true;
        return false;
    }
}
class Digit_Sum_Challenge
{
    public static void main(String[] args)
    {
        System.out.println("The sum of digits of 1 is "+sumDigits(1));
    }
    public static int sumDigits(int number)
    {
        if (number > 0)
        {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
}
