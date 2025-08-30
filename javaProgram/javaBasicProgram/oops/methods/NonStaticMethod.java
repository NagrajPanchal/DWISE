package oops.methods;

public class NonStaticMethod
{
    public void nonStaticMethod(int a, int b)
    {
        int res = a+b;
        System.out.println("Non Static Method");
        System.out.println("Non Static Method Arguments :"+res);
    }
    public void example()
    {
        System.out.println("Calling Non Static Method");
        nonStaticMethod(5,8);

    }

    public static void staticMethod()
    {
        System.out.println("Static Method");
    }



    public static void main(String[] args)
    {
        NonStaticMethod nsm = new NonStaticMethod();
        nsm.nonStaticMethod(6,3);
        nsm.example();
        NonStaticMethod.staticMethod();
        staticMethod();
    }
}
