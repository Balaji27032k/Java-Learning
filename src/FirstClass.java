public class FirstClass
{
    public static void main(String [] args)
    {
        System.out.println("Hello World");

        boolean isAlien=false;
        if(isAlien==false)
        {
            System.out.println("It's not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore=100;
        if(topScore<=100)
        {
            System.out.println("You got the high score!");
        }

        int secondTopScore=60;
        if((topScore>secondTopScore) && (topScore<100))
        {
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore>90) || (topScore<=90))
        {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue=50;
        if(newValue==50)
        {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(!isCar)//isCar  != true
        {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar="Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false:true;
        if(isDomestic)
        {
            System.out.println("This car is domestic to our country");
        }
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double variable_1 = 20.0d,variable_2=80.0d;
        double res = ((variable_1+variable_2)*100.0d)%40.0d;
        boolean resu =(res==0.0)?true:false;
        System.out.println(resu);
        if(!resu)
            System.out.println("got some remainder");
    }
}
