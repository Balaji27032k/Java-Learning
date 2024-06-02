package _1;

public class C_ifKeywordAndCodeBlocks
{
}
class Main_2
{
    public static void main(String[] args) {
        boolean gameOver=true;
        int score=800,levelCompleted=5,bonus=100;
        if(score<5000 && score>1000)
        {
            System.out.println("Your score was less than 5000 but greater than 1000");
        }
        else if(score<1000)
        {
            System.out.println("Your score was less than 1000");
        }
        else//must be last but optional
        {
            System.out.println("Got here");
        }
    }
}
class MainChallenge
{
    public static void main(String[] args) {
        {
            boolean gameOver = true;
            int score = 800, levelCompleted = 5, bonus = 100;
            int finalScore = score;
            if (gameOver) {
                finalScore += (levelCompleted * bonus);
                System.out.println("Your final score was " + finalScore);
            }
            gameOver = true;
            score = 10000; levelCompleted = 8; bonus = 200;
            finalScore = score;
            if (gameOver) {
                finalScore += (levelCompleted * bonus);
                System.out.println("Your final score was " + finalScore);
            }
            /*
            we're just copy pasting the code and replacing the variables with new values and it's a quicker approach.
            since we are duplicating code ,if there is any change in calculation we need to make the changes in more than
            one place,so you need to find a way to efficiently reuse the code,that's where methods came to our aid.
             */
        }
    }
}
