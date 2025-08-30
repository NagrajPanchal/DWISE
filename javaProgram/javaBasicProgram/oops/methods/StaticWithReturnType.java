package oops.methods;

public class StaticWithReturnType
{
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static float sub(float a, int b)
    {
        return a-b;
    }
    public static double mul(double a, int b)
    {
        return a*b;
    }
    public static boolean div(int b)
    {
        int a = 1;
        if(a == b)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static char ch()
    {
        return 'N';
    }
    public static String name(String a, String b)
    {
        String xy = a+b;
        return xy;
    }

    public static void main(String[] args)
    {
       int c = add(2,4);
        System.out.println(c);
        float d = sub(4.1f,2);
        System.out.println(d);
        double e = mul(4.02,2);
        System.out.println(e);
        boolean x = div(1);
        System.out.println(x);
        char y = ch();
        System.out.println(y);
        String xyz = name("Nagraj ", "Panchal");
        System.out.println(xyz);

    }
}
