package _1;

public class B_StatementsWhiteSpaceAndIndenting
{

}
class Main_1
{
    public static void main(String[] args) {
        int
                myVariable
                =
                50
                ; //Statement
        myVariable++;
        myVariable--;

        System.out.println("This is a test");
        System.out.println("This is" +
                " another " +
                "still more.");//statements won't have to be in single line.

        int anotherVariable =50;myVariable--;System.out.println("myVariable = "+myVariable);//This is also valid.
        //reformat code ctrl+Alt+L
        //you can remove leading indentation by clicking shift+Tab several times
    }
}
