package multithreading;
class Test implements Runnable
{
    public void run()
    {
        try{
            for(int i=1;i<=10;i++)
            {
                System.out.println("JavaEE: "+i);
                Thread.sleep(1000);
            }
        }catch(Exception e)
        {
            System.err.println(e);
        }
    }
}

public class MultiThreadImplementing implements Runnable
{
    public void run()
    {
        try{
            for(int i=1;i<=10;i++)
            {
                System.out.println("Core Java: "+i);
                Thread.sleep(2000);
            }
        }catch(Exception e)
        {
            System.err.println(e);
        }
    }
    public static void main(String args[])
    {
        try{
            Runnable r=new MultiThreadImplementing();
            Thread t=new Thread(r);
            t.start();
            Runnable r2=new Test();
            Thread t2=new Thread(r2);
            t2.start();
            for(int i=1;i<=10;i++)
            {
                System.out.println("Advanced Java : "+i);
                Thread.sleep(3000);
            }
        }catch(Exception e)
        {
            System.err.println(e);
        }
    }
}