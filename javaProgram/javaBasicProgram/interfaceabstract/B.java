package interfaceabstract;
interface A
{
    int a= 10;
    void show();
}
public class B implements A
{
    int y=20;
    @Override
    public void show() {
        System.out.println("Show() Method");
    }
    void display()
    {
        System.out.println("Display() Method");
    }
    public static void main(String[] args)
    {
        System.out.println(A.a);
        B b=new B();
        System.out.println(b.y);
        b.show();
        b.display();
    }
}
