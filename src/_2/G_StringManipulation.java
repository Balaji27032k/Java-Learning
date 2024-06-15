package _2;

public class G_StringManipulation
{
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = "+startingIndex);
        System.out.println("Birth year = "+birthDate.substring(startingIndex));
        //let's get the month from the year specified in DD/MM/YYYY -> we need to extract the string in position 3,4
        System.out.println("Month = "+birthDate.substring(3,5));//first number position included and last position excluded.
        //we can create a new date using join
        String newDate = String.join("/","25","11","1982");
        System.out.println("new date = "+newDate);
        //we can achieve the same using concat method as well
        newDate = "25";
        newDate=newDate.concat("/");
        newDate=newDate.concat("11");
        newDate=newDate.concat("/");
        newDate=newDate.concat("1982");
        System.out.println("newDate = "+newDate);
        //don't do code like this as it leads to many objects creation,the concat method does that same what + is doing

        newDate = "25"+"/"+"11"+"/"+"1982";
        System.out.println("new Date = "+newDate);
        newDate="25";
        newDate=newDate.concat("/").concat("11").concat("/").concat("1982");
        System.out.println("new Date = "+newDate);//this kind of writing is called method shading

        System.out.println("Replace Methods ");
        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace("2","00"));
        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","---"));
        //Let's first look at using repeat to create a multi line string with the escape sequence backslash n
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("     ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
