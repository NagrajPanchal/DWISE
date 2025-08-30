package newfeatures.methodreferences;
interface Test
{
    void show();
}
public class StaticMethodReferences
{
    static void print()
    {
        System.out.println("Static Method");
    }
    public static void main(String[] args) {
        Test t = StaticMethodReferences::print;
        t.show();
    }
}
