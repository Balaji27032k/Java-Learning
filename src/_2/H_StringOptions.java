package _2;

public class H_StringOptions
{
    public static void main(String[] args) {
        /*
        let's create a couple of overloaded methods one that take a string and other will take a string builder.both prints
        the value and its length.
         */
        String helloWorld = "Hello"+"World";
        // StringBuilder helloWorldBuilder = "Hello"+"World"; -> you'll get an error on running this.
        helloWorld.concat(" and GoodBye");
        StringBuilder helloWorldBuilder = new StringBuilder("Hello"+"World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);
        //Let's see how string is immutable and string builder is mutable.
        // let's use concat method on string and append method on string method which is similar to string's concat
        /*
        String
        Memory Before executing helloWorld.concat                   Memory after executing helloWorld.concat method
                               Heap memory                                      `   Heap memory
        helloWord----------> "Hello World"                          helloWord------------>  "Hello World"
                                                                                            "and Goodbye"
                                                            nothing points it -------->"Hello World and Goodbye"
        When we passed the String Literal,"and Goodbye",to the concat method,this created an Object in memory for that literal,
        "and Goodbye".
        It is also created the result of the concat method,the object,the String,that has the value,"Hello World and Goodbye".
        These methods don't change the internals of the existing String object.
        The String referenced by the helloWorld variable never changed,instead a new String was created by the method call.
        StringBuilder
Memory Before executing helloWorldBuilder.append                   Memory after executing helloWorldBuilder.append method
                                 heap memory                                                heap memory
                              **"Hello World"**                         **"Hello World"**    **"and Goodbye"**
        helloWordBuilder -----> "Hello World"                   helloWorldBuilder ----------> "Hello World and Goodbye"
        Here String and StringBuilders are marked in differnt font (the String is marked with *) and stringBuilder in
        normal font.
        we can see after call to the append method we still only have one StringBuilder Object.
        The variable helloWorldBuilder,is still referencing the same object,but the value of that object changed.
         */

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57)); //17 if we run it now the count changed to 34 it's capacity increased by jvm
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));
        printInformation(emptyStart);
        printInformation(emptyStart32);
        /*
        The major difference between the above two is that both have different capacity
        A StringBuilder is mutable,which means it can shrink or grow in size.
        By default an empty stringBuilder starts with a capacity of 16 meaning it can contain upto 16 characters,before it needs
        to request more memory.
        In the second example we created a stringbuilder with a capacity of 32 which means our sequence can go up to 32 characters
        without needing to request additional allocation.
        Everytime a stringbuilder needs to increase capacity the data stored in the original storage needs to be copied over to the
        larger storage data.
         */

        StringBuilder builderPlus = new StringBuilder("Hello"+" World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16,'g');
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }
    public static void printInformation(String string)
    {
        System.out.println("String = "+string);
        System.out.println("length = "+string.length());
    }
    public static void printInformation(StringBuilder builder)
    {
        System.out.println("StringBuilder = "+builder);
        System.out.println("length = "+builder.length());
        System.out.println("capacity = "+builder.capacity());
    }
}
