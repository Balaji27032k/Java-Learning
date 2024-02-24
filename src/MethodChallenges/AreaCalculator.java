package MethodChallenges;

public class AreaCalculator
{
    // write code here
    public static void main(String[] args) {
        area(5);
        area(5,4);
    }
    public static double area(double radius)
    {
        if(radius<0)
            return -1.0;


        return radius*radius*Math.PI;
    }
    public static double area(double x,double y)
    {
        if(x<0 || y<0)
            return -1.0;
        return x*y;
    }
}
