package polymorphism;
public class MethodOverLoadingCompileTimeStaticPolymorphism
{
    int add(int a,int b)
    {
        int c = a+b;
        System.out.println("Method Overloading or Runtime or Static Polymorphism");
        System.out.println("Adding 2 integers :"+a+"+"+b+"="+c);
        return c;
    }
    int add(int a, int b,int c)
    {
        int d = a+b+c;
        System.out.println("Adding 3 integers :"+a+"+"+b+"+"+c+"="+d);
        return d;
    }
    double add(double a,double b, double c)
    {
        double d = a+b+c;
        System.out.println("Adding 3 doubles :"+a+"+"+b+"+"+c+"="+d);
        return d;
    }
    public static void main(String[] args)
    {
        MethodOverLoadingCompileTimeStaticPolymorphism p = new MethodOverLoadingCompileTimeStaticPolymorphism();
        p.add(2,4);
        p.add(3,4,5);
        p.add(3.01,2.02,4.51);
    }
}
