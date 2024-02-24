package SwitchExample;

public class SwitchChallenge_1 {
    public static void main(String[] args) {
        NATO_code('D');
        printDayOfWeek(7);
    }
    public static void NATO_code(char code)
    {
        switch (code)
        {
            case 'A' -> System.out.println("A is able");
            case 'B' -> System.out.println("B is baker");
            case 'C' -> System.out.println("C is charlie");
            case 'D' -> System.out.println("D is dog");
            case 'E' -> System.out.println("D is easy");
            default -> System.out.println("Letter "+code+" is not found in the switch statements");
        }
    }
    public static void printDayOfWeek(int day)
    {
        switch (day)
        {
            case 0 -> System.out.println(day + " Sunday");
            case 1 -> System.out.println(day + " Monday");
            case 2 -> System.out.println(day + " Tuesday");
            case 3 -> System.out.println(day + " Wednesday");
            case 4 -> System.out.println(day + " Thursday");
            case 5 -> System.out.println(day + " Friday");
            case 6 -> System.out.println(day + " Saturday");
            default -> System.out.println(day + " Invalid day");
        }
    }
    public static void printWeekDay(int day)
    {

    }
}
