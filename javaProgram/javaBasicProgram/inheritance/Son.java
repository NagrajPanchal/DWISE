package inheritance;
class Dad
{
    public void m1()
    {
        System.out.println("Dad Property");
    }
}
public class Son extends Dad
{
    void m2()
    {
        System.out.println("Son Property");
    }
    public static void main(String[] args) {
        Son s = new Son();
        s.m1();
        s.m2();
    }
}
