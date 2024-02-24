package SwitchExample;
/*
Valid Switch Type Values
byte,short,int,char
Byte,Short,Integer,Character
String,enum.
 */
//If all our test conditions are testing a single variable's state.In that case you can use switch statement.
/*
Fall through concept in switch case
Once a switch case variable matches the switch variable , no more cases are checked.
Any code after the case label where there was a match found ,will be executed until a break statement or end of the
switch statement occurs.
Without break statement ,execution will continue to fall through any case labels declared below the matching one,
and execute each case's code.
 */
public class Introduction
{
    public static void main(String[] args)
    {
        oldMethod();
        newMethod();
        System.out.println(getQuarter("xyz"));
    }
    public static void oldMethod()
    {
        int value = 3;
        if (value == 1)
            System.out.println("Value was 1");
        else if (value == 2)
            System.out.println("Value was 2");
        else
            System.out.println("Value was neither 1 nor 2");
    }
    public static void newMethod()
    {
        int value=4;
        switch (value) {
            case 1 -> System.out.println("The value is 1");
            case 2 -> System.out.println("The value is 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("Actually it was " + value);
            }
            default -> System.out.println("The value is not 1,2,3,4,5");
        }
    }

    public static String getQuarter(String month)
    {
        return switch(month)
        {
            case "January","February","March" ->  "First Quarter";
            case "April","May","June" -> "Second Quarter";
            case "July","August","September" ->  "Third Quarter";
            case "October","November","December" ->  "Fourth Quarter";
            default ->{yield  "Enter a valid month";}//instead of return you can use yield to do the same job.
        };
    }
}

