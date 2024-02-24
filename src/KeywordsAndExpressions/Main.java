package KeywordsAndExpressions;

public class Main
{
    public static void main(String[] args)
    {
       // int int = 5; -> keywords cannot be used as variable name
        int int2 =5;//it'll work
        double kilometers = (100* 1.609344);

        int highScore =50;

        if(highScore > 25)
        {
            highScore = 1000+highScore; // add bonus points
        }

        int health =100; // expression 1. assignment

        if((health < 25) && (highScore > 1000)) // 3 expressions 1.less than check, 2.greater than check, 3. && operation
        {
            highScore = highScore - 1000; // 2 expressions here 1. subtraction , 2. assignment
        }//Overall 6 expressions in this code

    }
}
