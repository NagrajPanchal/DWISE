package innerclasses.staticmemberclass;
class A
{
    static class B
    {
        void show()
        {
            System.out.println("Inner Class A inside B of Static Member Class");
        }
    }
}
public class StaticMemberClass {
public static void main(String[] args)
{
    A.B b=new A.B();
    b.show();
}
}
