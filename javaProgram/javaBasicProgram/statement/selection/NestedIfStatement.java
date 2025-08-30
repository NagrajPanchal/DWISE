package statement.selection;

public class NestedIfStatement
{
    public static void main(String args[])
    {
        int a=5;
        if(a>0)
        {
            if(a%2==0)
                System.out.println("Even Number");
            else
                System.out.println("Odd Number");
        }
        else
        {
            if(a<0)
                System.out.println("Negative Number");
            else
                System.out.println("Zero");
        }
    }
}
