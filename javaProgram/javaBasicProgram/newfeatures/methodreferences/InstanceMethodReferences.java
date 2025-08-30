package newfeatures.methodreferences;
public class InstanceMethodReferences
{
    void print()
    {
        System.out.println("Instance Method");
    }
    public static void main(String[] args) {
        InstanceMethodReferences d=new InstanceMethodReferences();
        Test t=d::print;
        t.show();
    }
}
