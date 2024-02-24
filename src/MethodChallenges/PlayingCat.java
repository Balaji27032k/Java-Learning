package MethodChallenges;

public class PlayingCat
{
    // write code here
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,45));
    }
    public static boolean isCatPlaying(boolean summer,int temparature)
    {
        if(summer && temparature>=25 && temparature<=45)
            return true;
        else if(!summer && temparature>=25 && temparature<=35)
            return true;
        return false;
    }

}