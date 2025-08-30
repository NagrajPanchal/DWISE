package oops.methods;

public class StaticClassMethodAccess
{
    public static String staticClassMethodAccess()
    {
        System.out.println("Static Class Method");
        return null;
    }
    public static void main(String[] args)
    {
        staticClassMethodAccess(); // Directly access static class method
        StaticClassMethodAccess.staticClassMethodAccess(); // By using Class Name
        StaticClassMethodAccess cma = new StaticClassMethodAccess();
        cma.staticClassMethodAccess(); // By Using Object
        String ref = cma.staticClassMethodAccess(); // By Using Object Reference (Only When using return type)
        System.out.println(ref); // calling Reference object
    }
}
