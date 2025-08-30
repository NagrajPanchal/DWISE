package oops.methods;

public class MethodWithArgsWithoutReturnValue
{
    void add(int a, int b)// MethodWithArgsWithoutReturnValue
    {
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String args[])
    {
        MethodWithArgsWithoutReturnValue d=new MethodWithArgsWithoutReturnValue();
        d.add(5, 3);
    }
}
