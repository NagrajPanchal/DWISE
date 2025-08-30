package basicclass;

public class Substraction
{
    void sub(int a, int b)
    {
     int c = a-b;
        System.out.println("Substraction of 2 numbers a & b is : "+c);
    }
    public static void main(String[] args)
    {
        Substraction obj = new Substraction();
        obj.sub(5,3);
    }
}
