package _1;

public class A_KeywordsAndExpressions
{

}
class Main
{
    public static void main(String[] args) {
        //int int = 5;
        //you can't use the reserved words as name for your variable
        //int int2 =5;
        //make sure to not use any reserved words on your varaible names
        /*
        Note: null is not a keyword,but rather the null literal.
        true and false are not keywords but rather boolean literals
         */
//        int null=2;
//        String true = "bala";
        //you can't use them as variable name as well.
        /*
        Java Code units consists of special hierarchial units ,which together form a whole.
        These are :
        The Expression - An expression computes to a single value.
        The Statement - Statements are stand alone units of work.
        Code Blocks - A code block is a set of zero,one or more statements usually grouped together in some way to achieve a single goal.

         */
        double kilometers = (100*1.609344); //expression to convert miles to kilometers 100 miles to what kms.
        //The entire line is a valid statement. we know expression can include variable,values and operators.
        //we know as we end it with a semi colon we created a valid statement.
        int highScore = 50;
        if(highScore >25)
        {
            highScore=1000+highScore;
        }
        /* here highScore>25 is an expression but the entire if with curley braces is not.so the entire
           block with the parenthesis is an if statement or conditional statement.
           also the highScore=1000+highScore -> is an expression (without the semicolon).
        */
        int health =100;
        if((health<25)&&(highScore>1000))
        {
            highScore = highScore-1000;
        }
        /* remember datatype and semicolon are not part of the expression.
          health =100 , (health<25)&&(highScore>1000) , highScore = highScore-1000 -> expressions.

         */
    }
}
