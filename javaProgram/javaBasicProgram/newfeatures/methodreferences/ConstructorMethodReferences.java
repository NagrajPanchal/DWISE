package newfeatures.methodreferences;
public class ConstructorMethodReferences
{
    ConstructorMethodReferences()
    {
        System.out.println("Constructor Method");
    }
    public static void main(String[] args) {
        Test t = ConstructorMethodReferences::new;
        t.show();
    }
}
