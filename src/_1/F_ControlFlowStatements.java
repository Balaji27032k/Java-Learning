package _1;

public class F_ControlFlowStatements
{
    public static void main(String[] args) {
    /*    int value =3;
        if(value==1)
        {
            System.out.println("Value was 1");
        }
        else if(value==2)
        {
            System.out.println("Value was 2");
        }
        else
            System.out.println("Was not 1 or 2");
    }*/
        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was any of 3 or 4 or 5");
                System.out.println("Actually it was " + switchValue);
            }
            default -> System.out.println("was not 1,2,3,4,5");
        }
        String month = "OCTOBER";
        System.out.println(month+" is in the "+getQuarter(month)+" Quarter.");
    }
    public static String getQuarter(String month)
    {
        String result = switch (month) { //return switch (month) -> switch statement is an expression.
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is Invalid month";
                yield badResponse;//return statement will not work here.
            }
        };
        return result;
    }
}

class Traditional_switch_Challenge
{
    public static void main(String[] args) {
        String word = "CAB";
        for(int i=0;i<word.length();i++)
        {
            Nato_convert(word.charAt(i));
        }
    }
    public static void Nato_convert(char value)
    {
        switch (value)
        {
            case 'A':
                System.out.print("Able \t");
                break;
            case 'B':
                System.out.print("Baker \t");
                break;
            case 'C':
                System.out.print("Charlie \t");
                break;
            case 'D':
                System.out.print("Dog \t");
                break;
            case 'E':
                System.out.print("Easy \t");
                break;
            default:
                System.out.println("Invalid letter");
        }
        /*long num = 5l;
        String other = switch (num)
        {
            case 1 -> "value 1";
            case 2 -> "value 2";
            case 3 -> "value 3";
            default -> "null";
        };*/
    }
}
class Enhanced_Switch_Challenge
{
    public static void main(String[] args) {
        for(int i=0;i<8;i++)
        {
            printDayOfWeek(i);
        }
    }
    public static void printDayOfWeek(int day)
    {
        String dayOfTheWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println("Day "+day+" - "+dayOfTheWeek);
    }
}
