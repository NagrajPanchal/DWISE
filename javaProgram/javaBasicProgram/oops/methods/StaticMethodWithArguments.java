package oops.methods;

public class StaticMethodWithArguments
{
    public static void area(double pi,int r)
    {
        double res = pi * r * r ;
    }
    public static void main(String[] args)
    {
        area(3.14,5);
    }
}
