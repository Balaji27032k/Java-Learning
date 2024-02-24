package MethodChallenges;

public class MethodChallenge
{
    public static void main(String[] args) {
        String name = "Tim";
        int Position = 2;
        displayHighScorePosition(name,Position);

        int[] arr = {1500,1000,500,100,25};

        String[] names = {"Tim","Rim","Jim","Bob","Rob"};
        for(int i=0;i<arr.length;i++)
        {
            displayHighScorePosition(names[i],arr[i]);
        }
    }
    public static void displayHighScorePosition(String name,int Position)
    {
        System.out.println(name+" managed to get into position "+calculateHighScorePosition(Position)+" on the high score list");
    }
    public static int calculateHighScorePosition(int playerScore)
    {
        int position=4;
        if(playerScore>=1000)
            position = 1;
        else if (playerScore >= 500)
            position = 2;
        else if (playerScore >=100)
            position = 3;
        return position;
    }
}
