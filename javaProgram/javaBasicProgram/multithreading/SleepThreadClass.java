package multithreading;
public class SleepThreadClass
{
    public static void main(String[] args) {
        for(int i=1; i<=10; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.err.println(e);
            }
        }
    }
}
