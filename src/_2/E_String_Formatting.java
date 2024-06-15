package _2;

public class E_String_Formatting
{
    public static void main(String[] args) {
        //code that uses the pre JDK 15 way of handling multiple lines of text:
        String bulletIt = "Print a Bulleted List:\n"+
                "\t\u2022 First Point\n"+
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);
        /*
            if we print these ,we get everything in a single line but that's not what i want so I have to use escape sequence
            to achieve the formatting in the old way.
                    Escape Sequence                 Description
                    \t                          Insert a tab character.
                    \n                          Insert a new line character.
                    \"                          Insert a double quote character
                    \\                          Insert a backslash character.

         */
        //let's use text block to do the same
        String textBlock = """
                Print a Bulleted List:
                        \u2022 First Point
                            \u2022 Sub Point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d %n",age);//replace escape sequence \n with %n
        int yearOfBirth = 2023-age;
        System.out.printf("Age = %d, Birth Year = %d%n",age,yearOfBirth);
        /*
           Format Specifiers
           At their most complex, format specifiers take the form shown here.
           %[argument_index$][flags][width][.precision]conversion
                They start with a percent sign,and end with a conversion symbol,and have lots of options in between.
                We've looked at one conversion type, d ,which is the symbol used for a decimal integer value.
         */
        System.out.printf("Your age is %.2f %n",(float)age);//set precision to 2 decimal places

        for(int i=1;i<=100000;i*=10)
        {
            System.out.printf("Printing %6d %n",i);//if you run %d then all are specified in left most side.
        }
        /*
            These are the most common things you'd do with formatting.we can use format anywhere where soutf is used.
            But there are times you want to format strings and output them to a file,or error log or a database.
            The string class itself has 2 methods,to support this type of formatting as well.One is a static method called
            format.
         */
        String formattedString = String.format("Your age is %d",age);
        System.out.println(formattedString);
        /*
        This method was included in JDK 15,and it works the same as String.format except you don't need pass the format String
        as an argument.The String itself is a formatted String.
         */
        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
        /*
        When you use this method,you just pass the arguments that match the specifiers in the current String,and the result
        is a formatted String.
         */
    }
}
