package polymorphism;
class Dad
{
    void methodDefineSuperClassSameSignatureSubClass()
    {
        System.out.println("Method Overriding");
    }
    String methodDefineSuperClassSameSignatureSubClass(String s)
    {
        System.out.println("Dad Class "+s);
        return s;
    }
}
public class Overriding extends Dad {
    @Override
    String methodDefineSuperClassSameSignatureSubClass(String s)
    {
        System.out.println("Sub Class "+s);
        return s;
    }
    public static void main(String[] args) {
        Dad d1 = new Dad();
        d1.methodDefineSuperClassSameSignatureSubClass();
        d1.methodDefineSuperClassSameSignatureSubClass("Panchal");
        Overriding or = new Overriding();
        or.methodDefineSuperClassSameSignatureSubClass("Nagraj");
    }
}
