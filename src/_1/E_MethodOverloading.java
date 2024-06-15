package _1;

public class  E_MethodOverloading
{
    public static void main(String[] args) {
        System.out.println("The new Score is "+calculateScore("Tim",500));
        calculateScore(75);
        calculateScore();
    }
    public static int calculateScore(String playerName,int score)
    {
        System.out.println("Player "+playerName+" scored "+score+" points.");
        return score*1000;
    }
    public static int calculateScore(int score)
    {
        return calculateScore("Anonymous",score);
    }

    public static int calculateScore()
    {
        System.out.println("No Player name,No player Score.");
        return 0;
    }
    /*public static void calculateScore()
    {
        System.out.println("No Player name,No player Score.");
    }*/
}
class MethodOverloading_Challenge
{
    public static void main(String[] args) {
        System.out.println("68in = "+convertToCentimeters(68));
        System.out.println("6ft, 8in = "+convertToCentimeters(6,8));
    }
    public static double convertToCentimeters(int heightinInches)
    {
        return heightinInches*2.54;
    }
    public static double convertToCentimeters(int heightInFeet,int remainingHeightInInches)
    {
        return  convertToCentimeters((12*heightInFeet)+remainingHeightInInches);
    }
}
class MethodOverloading_Challenge2
{
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(65,145));
    }
    public static String getDurationString(int seconds)
    {
        //Two step approach to get hours
        if (seconds < 0){
            return "Invalid data for seconds("+seconds+"), must be positive Integer value";
        }
        //int mins = seconds / 60;
        /*
            int hours = mins/60;
            int remainingMinutes=mins%60;
            int remainingSeconds=seconds%60;

//        One step approach to get hours
//        int hrs = seconds/3600;
//        System.out.println("hours = "+hrs);
//        return "";
        return hours+"h "+remainingMinutes+"m "+remainingSeconds+"s";*/
        return getDurationString(seconds/60, seconds%60);
    }
    public static String getDurationString(int minutes,int seconds)
    {
        if (minutes < 0){
            return "Invalid data for minutes("+minutes+"), must be positive Integer value";
        }
        if (seconds < 0 || seconds >59){
            return "Invalid data for seconds("+seconds+"), must be between 0 and 59";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}