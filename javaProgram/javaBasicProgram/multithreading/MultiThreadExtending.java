package multithreading;

public class MultiThreadExtending extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1; i<=10; i++)
            {
                System.out.println("Child Thread :"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        try
        {
            MultiThreadExtending mte = new MultiThreadExtending();
            mte.start();
            for(int i=1; i<=10; i++)
            {
                System.out.println("Main Thread :"+i);
                Thread.sleep(1000);
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
