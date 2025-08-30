
package exception;
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try{
            int x= Integer.parseInt(args[0]);
            int y= Integer.parseInt(args[1]);
            int z = x/y;
            System.out.println(z);
        }
        catch (ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Please pass two Arguments ");
        }
        catch (NumberFormatException ne)
        {
            System.out.println("Please pass two numbers only ");
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Please pass second Arguments except Zero");
        }
    }
}

