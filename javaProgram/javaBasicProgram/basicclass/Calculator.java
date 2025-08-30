package basicclass;

public class Calculator
{
    int a = 4 , b = 4;
    public void add()
    {
        int add = a + b;
        System.out.println("Addition :"+add);
    }
    public static void sub(int a, int b)
    {
        int sub = a - b;
        System.out.println("Substraction :"+sub);
    }
    public static void mul(int a, int b)
    {
        int mul = a * b;
        System.out.println("Multiplication :"+mul);
    }
    public static void div(int a, int b)
    {
        int div = a / b;
        System.out.println("Division :"+div);
    }


    public static void main(String[] args)
    {
        Calculator c = new Calculator();
        c.add();
        sub(4,2);
        mul(4, 2);
        div(4,2);
    }
}
