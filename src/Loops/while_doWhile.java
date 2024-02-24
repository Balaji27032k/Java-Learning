package Loops;

public class while_doWhile
{
    /*
    if you want to loop until some condition is met,that's not associated with a known range of values.then you can
    use this while loop.

    while -> Continue executing code block until the loop expression becomes false.
    do while -> Execute the code block once,then continue executing until the loop condition becomes false.

    continue -> The continue statement, in its simplest form will stop executing the current iteration of a
    block of code in a loop and start a new iteration.
     */
    public static void main(String[] args)
    {
        //loopers();

        int number=0;
        while(number<50)
        {
            number+= 5;
            if(number%25==0)
                continue;
            System.out.print(number+"_");
        }
    }
    public static void loopers()
    {
        for(int i=1;i<=5; i++)
        {
            System.out.println(i);
        }

        int j=1;
        boolean isReady = false;
        do
        {
            if(j>5)
            {
                break;
            }
            System.out.println(j);
            j++;
            isReady = (j>0);
        }while(isReady);

        while(isReady)
        {
            if(j>5)
            {
                break;
            }
            System.out.println(j);
            j++;
        }
    }
}

