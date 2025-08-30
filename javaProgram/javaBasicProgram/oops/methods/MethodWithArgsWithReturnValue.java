package oops.methods;

public class MethodWithArgsWithReturnValue
{
    int add(int a, int b) //Method with Arguments
    {
        int c=a+b;
        return c; // Return value
    }
    public static void main(String args[])
    {
        int x=new MethodWithArgsWithReturnValue().add(4, 3); // By using object
        System.out.println(x);
        MethodWithArgsWithReturnValue d=new MethodWithArgsWithReturnValue();
        int y=d.add(5, 3); // By using object reference
        System.out.println(y);
    }
}
