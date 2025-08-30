package newfeatures.methodreferences;
class Test1
{
    static void show()
    {
        try{
            for (int i = 1; i <=10 ; i++) {
                System.out.println("Child Class :" +i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
}
public class RunnableInterfaceMethodReference
{
    public static void main(String[] args) {
        Runnable r1 = Test1::show;
        Thread t1 = new Thread(r1);
        t1.start();
        try
        {
            for (int i = 1; i <=10 ; i++) {
                System.out.println("Main Class : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
}
