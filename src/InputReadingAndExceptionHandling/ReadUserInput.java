package InputReadingAndExceptionHandling;

public class ReadUserInput
{
    public static void main(String[] args) {
        int currentYear=2024;
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear)
    {
        String name = System.console().readLine("Hi,What's your name? ");
        System.out.println("Hi"+name+", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("Hi "+name+" what year you born?");
        return "So you are "+(currentYear-Integer.parseInt(dateOfBirth))+" years old";
    }
    public static String getInputFromScanner(int currentYear)
    {

        return "";
    }
}
