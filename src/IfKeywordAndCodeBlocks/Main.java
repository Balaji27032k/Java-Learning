package IfKeywordAndCodeBlocks;

public class Main
{
    public static void main(String[] args)
    {
        boolean gameOVer = true;
        int score = 5000;
        int lovelCompleted = 5;
        int bonus = 100;

        /*if(score == 5000)
        {
            System.out.println("Your score was 5000");
        }
        if(score < 5000) it won't run now whereas the control goes to else block
        {
            System.out.println("Your score was less than 5000");
        }*/

        if(score <= 5000)//it'll run now and the control is not reach else block.
        {
            System.out.println("Your score was less than 5000");
        }
        else
        {
            System.out.println("Got here");
        }
    }
}
