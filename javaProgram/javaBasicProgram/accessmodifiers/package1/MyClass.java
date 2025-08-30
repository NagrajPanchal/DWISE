package accessmodifiers.package1;

public class MyClass
{
    public int publicVar =10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;   // No modifier, so it's default (package-private)

    public void publicMethod()
    {
        System.out.println("Public method Called");
    }
    private void privateMethod()
    {
        System.out.println("Private Method Called");
    }
    protected void protectedMethod()
    {
        System.out.println("Protected Method Called");
    }
    void defaultMethod()
    {
        System.out.println("Default Method Called");
    }
    public void demonstrateAccess()
    {
        System.out.println("In Side MyAccessModifiersClass");
        System.out.println("Public variable : "+publicVar);
        System.out.println("Private Variable : "+privateVar);
        System.out.println("Protected Variable :"+protectedVar);
        System.out.println("Default variable :"+defaultVar);
        publicMethod();
        privateMethod();
        protectedMethod();
        defaultMethod();
    }
}
