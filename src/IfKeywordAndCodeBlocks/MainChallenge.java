package IfKeywordAndCodeBlocks;

public class MainChallenge
{
    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("The highScore is "+highScore);

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next highScore is "+calculateScore(gameOver,score,levelCompleted,bonus));

    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus)
    {
        /*boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;*/
        //You can't redeclare the variables inside a method (i.e both declaration variable name and parameters shouldn't be same)
        int finalScore = score;

        if(gameOver)
        {
            finalScore += (levelCompleted * bonus);
        }

        return finalScore;
    }
}
