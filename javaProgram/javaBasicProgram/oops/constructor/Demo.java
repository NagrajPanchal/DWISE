package oops.constructor;
public class Demo
{
    Demo()
    {
        System.out.println("Default Constructor");
    }
    Demo(int a)
    {
        this();
        System.out.println("Parameterized Constructor : "+a);
    }
    public static void main(String[] args)
    {
        new Demo(5);
    }
}
