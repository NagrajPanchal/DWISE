package basicclass;

public class Blocks
{
    {
        System.out.println("Block1");
    }
    Blocks()
    {
        System.out.println("Constructor");
    }
    public static void main(String args[])
    {
        new Blocks();
        System.out.println("Main Method");
    }
    {
        System.out.println("Block2");
    }
}
