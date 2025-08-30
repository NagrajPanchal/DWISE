package basicclass;

public class StaticBlocks
{
    static
    {
        System.out.println("Static Block1");
    }
    public static void main(String args[])
    {
        System.out.println("Main Method");
    }
    static
    {
        System.out.println("Static Block2");
    }
}
