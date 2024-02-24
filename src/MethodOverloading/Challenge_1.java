package MethodOverloading;

public class Challenge_1
{
    public static void main(String[] args) {
        System.out.println("6ft, 0in = "+convertToCentimeters(6,0)+"cm");
        System.out.println("68in = "+convertToCentimeters(68)+"cm");
    }
    public static double convertToCentimeters(int heightInInches)
    {
        return heightInInches*2.54;
    }
    public static double convertToCentimeters(int heightInFeet,int remainingHeightInInches)
    {
        return convertToCentimeters(((heightInFeet*12)+remainingHeightInInches));
    }
}
