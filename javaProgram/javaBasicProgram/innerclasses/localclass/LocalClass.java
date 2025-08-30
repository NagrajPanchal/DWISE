package innerclasses.localclass;

public class LocalClass
{
    public static void main(String args[])
    {
        class Test
        {
            void show()
            {
                System.out.println("Inner Local Class inside Test");
            }
        }
        Test t=new Test();
        t.show();
    }
}
