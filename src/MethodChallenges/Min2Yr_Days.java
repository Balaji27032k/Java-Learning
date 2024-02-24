package MethodChallenges;

public class Min2Yr_Days
{
    public static void main(String[] args) {
        printYearsAndDays(560000);
    }
        // write code here
        public static void printYearsAndDays(long minutes)
        {
            if(minutes<0)
                System.out.println("Invalid Value");
                //1 day = 24 * 60 minutes = 1440 mins
                //1 year = 365 days = mins / 1440 *365
                //1 year = days / 365
            else
            {
                int MIN_PER_YEAR = 365 * 24 * 60 ;
                int MIN_PER_DAY = 24 * 60 ;
                int DAYS_PER_YEAR = 365;
                int year = (int) minutes / MIN_PER_YEAR; // give total year

                int remaining_days = (int) (minutes/MIN_PER_DAY) % DAYS_PER_YEAR; // days for a year % 365

                System.out.println(minutes+" min = "+year+" y and "+remaining_days+" d");
            }
        }
}
