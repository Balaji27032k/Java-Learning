package _1;

public class D_Methods
{
    /*
    A method declares executable code that can be invoked,passing a fixed number of values as arguments.
    Benefits :
    A method is a way of reducing code duplication.
    A method can be executed many times with potentially different results,by passing data to the method in the form of
    arguments.
    Syntax :
    public static void methodName()
    {
        //Method statements form the method body.
    }
    void -> means it returns no data returned from the method.
    static -> it can be directly called using the method name.
    Use lower camel case to create a method.

    calling a method -> just put the name of the method with parenthesis and semicolon.

    you can pass information to a method using method parameters
    public static void methodName(p1type p1,p2type p2,{more})
    {
        //Method statements form the method body.
    }
    Parameter -> it's a definition shown in the method declaration.
    Argument -> it's a Value that's passed to the method when we call it.
    Method Structure with parameters and return type
    public static dataType methodName(p1type p1,p2type p2,{more})
    {
        //method statements
        return value;
    }
    The return statement
    Java states that a return statement returns the control to the invoker of a method.
    The most common usage of the return statement is to return a value back from a method.
     */
    public static void main(String[] args) {

        System.out.println("The High Score is "+calculateScore(true,800,5,100));
        System.out.println("The next High Score is "+calculateScore(true,10000,8,200));

        /*if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        gameOver = true;
        score = 10000; levelCompleted = 8; bonus = 200;
        finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }*/
    }
    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus)
    {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore+=1000;
            //System.out.println("Your final score was " + finalScore);
        }
        return finalScore;
    }
}
class Methods_Challenge
{
    public static void displayHighScorePosition(String playerName,int highScorePosition)
    {
        System.out.println(playerName+" managed to get into position "+highScorePosition+" on the high score list");
    }
    public static int calculateHighScorePosition(int playerScore)
    {
        return playerScore>=1000 ?1: playerScore>=500 ?2: playerScore >= 100 ?3:4;
    }

    public static void main(String[] args) {
        displayHighScorePosition("Tim",calculateHighScorePosition(1500));
        displayHighScorePosition("Bob",calculateHighScorePosition(999));//1000
        displayHighScorePosition("Percy",calculateHighScorePosition(499));//500
        displayHighScorePosition("Gilbert",calculateHighScorePosition(99));//100
        displayHighScorePosition("James",calculateHighScorePosition(-1000));//25
    }
}
