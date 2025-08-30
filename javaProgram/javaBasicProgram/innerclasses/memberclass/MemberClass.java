package innerclasses.memberclass;
class A
{
    class B
    {
        void show()
        {
            System.out.println("Inner Class A inside B of Member Class");
        }
    }
}
public class MemberClass {
    public static void main(String[] args)
    {
        A a=new A();
        A.B b=a.new B();
        b.show();
    }
}
