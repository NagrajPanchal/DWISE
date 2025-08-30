package accessmodifiers;
public class FinalVariable
{
    static int max_value = 10;
    static void show()
    {
        System.out.println("Not Final Variable  ;" +max_value);
    }
    public static void main(String[] args)
    {
        show();
        final int max_value = 100;
        System.out.println("Max value : \t"+max_value);
    }
}
