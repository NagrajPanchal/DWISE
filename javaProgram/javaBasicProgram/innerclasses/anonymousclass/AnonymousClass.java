package innerclasses.anonymousclass;
interface Test
{
    void show();
}
public class AnonymousClass
{
    public static void main(String[] args)
    {
        Test t = new Test()
        {
            @Override
            public void show() {
                System.out.println("Anonymous Class type of local class");
            }
        };
        t.show();
    }
}
