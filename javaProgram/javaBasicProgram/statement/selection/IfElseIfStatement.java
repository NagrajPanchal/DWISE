package statement.selection;

public class IfElseIfStatement
{
    public static void main(String args[])
    {
        int a=5;
        if(a>0)
        {
            System.out.println("Positive Number");
        }
        else if(a<0)
        {
            System.out.println("Negative Number");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
