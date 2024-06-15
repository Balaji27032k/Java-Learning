package _2;

import java.util.Locale;

public class F_AllAboutStrings
{
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n",helloWorld.indexOf('r'));
        System.out.printf("index of world = %d %n",helloWorld.indexOf("World"));

        System.out.printf("Index of l = %d %n",helloWorld.indexOf('l'));
        System.out.printf("Last index of l = %d %n",helloWorld.lastIndexOf('l'));

        System.out.printf("Second Index of l = %d %n",helloWorld.indexOf('l',3));
        System.out.printf("Second Last index of l = %d %n",helloWorld.lastIndexOf('l',8));

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower))
            System.out.println("Values match exactly");
        if(helloWorld.equalsIgnoreCase(helloWorldLower))
            System.out.println("Values match ignoring case");
        if(helloWorld.startsWith("Hello"))
            System.out.println("String starts with Hello");
        if(helloWorld.endsWith("World"))
            System.out.println("String ends with World");
        if(helloWorld.contentEquals("Hello World"))
            System.out.println("Values match exactly");
        /*
        The content equals method isn't limited to comparing string objects it can be used to compare string builders value
        which the equals method doesn't support.
         */
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n",length);

        if(string.isEmpty())
        {
            System.out.println("String is Empty");
            return;
        }

        if(string.isBlank())
        {
            System.out.println("String is Blank");
        }
        System.out.printf("First char = %c %n",string.charAt(0));//passing index that's invalid cause runtime exception.
        System.out.printf("Last char = %c %n",string.charAt(length-1));
    }
}
