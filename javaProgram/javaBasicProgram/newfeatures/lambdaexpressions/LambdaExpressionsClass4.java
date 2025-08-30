package newfeatures.lambdaexpressions;

public class LambdaExpressionsClass4
{
    public static void main(String[] args) {
        Runnable r=()->
        {
            try{
                for(int i=1;i<=10;i++)
                {
                    System.out.println("Child Thread: "+i);
                    Thread.sleep(1000);
                }
            }catch(Exception e)
            {
                System.err.println(e);
            }
        };
        Thread t=new Thread(r);
        t.start();
        try{
            for(int i=1;i<=10;i++)
            {
                System.out.println("Main Thread: "+i);
                Thread.sleep(1000);
            }
        }catch(Exception e)
        {
            System.err.println(e);
        }
    }
}
