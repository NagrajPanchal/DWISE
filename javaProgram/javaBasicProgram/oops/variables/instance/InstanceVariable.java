package oops.variables.instance;
public class InstanceVariable
{
    int x=10; // instance variable
    public static void main(String args[])
    {
        System.out.println(new InstanceVariable().x); // By using object
        InstanceVariable i=new InstanceVariable();
        System.out.println(i.x); // By using object reference
    }
}
