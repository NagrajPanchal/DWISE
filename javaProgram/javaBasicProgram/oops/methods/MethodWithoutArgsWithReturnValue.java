package oops.methods;

public class MethodWithoutArgsWithReturnValue
{
    int get() //MethodWithoutArgs
    {
        int a=5;
        return a; //WithReturnValue
    }
    public static void main(String args[])
    {
        MethodWithoutArgsWithReturnValue d=new MethodWithoutArgsWithReturnValue();
        int x=d.get();
        System.out.println(x);
    }
}
