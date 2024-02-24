package MethodOverloading;

public class Challenge_2
{
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
       // System.out.println(getDurationString(65,45));
        System.out.println(myMethod(3945));

    }

    public static String getDurationString(int seconds)
    {
        if(seconds>=0)
        {
            int min=seconds/60;
            return getDurationString(min,(min%60)*60);
        }
        else
            return "Enter a valid seconds value";
    }
    public static String getDurationString(int minutes,int seconds)
    {
        if(minutes>=0 && seconds>=0 && seconds<=59)
        {
            int hours=minutes/60;

            int remaining_mins=minutes%60;
            int remaining_seconds=seconds%60;

            return hours+"h "+remaining_mins+"m "+remaining_seconds+"s";
        }
        else
            return "Enter a valid value";
    }

    public static String myMethod(int seconds)
    {
        return seconds/3600+"h "+(seconds-(seconds/3600)*3600)/60+"m ";//+seconds/60+"m "+seconds
    }
}
