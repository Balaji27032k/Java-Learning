package MethodOverloading;

public class Challenge_2_Sec2Min
{
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(3965));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(65,145));
    }

    public static String getDurationString(int seconds)//3565
    {
        if(seconds<0)
        {
            return "Invalid data for seconds( " + seconds + "), must be a positive integer value";
        }
        return getDurationString(seconds/60, seconds%60);
    }
    public static String getDurationString(int minutes,int seconds)
    {
        if(minutes<0)
        {
            return "Invalid data for minutes(" + minutes + "), must be a positive integer value";
        }
        if(seconds<0 || seconds>59)
        {
            return "Invalid data for seconds("+seconds+"), must be a integer value between 0 and 59";
        }
        int hours = minutes / 60;

        int remaining_mins = minutes%60;
        /*System.out.println("remaining seconds = "+remaining_seconds);
        int hours1 = seconds / 3600;
        System.out.println("hours1 = "+hours1);*/
        return hours+"h "+remaining_mins+"m "+seconds+"s";
    }
}
