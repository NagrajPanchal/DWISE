package newfeatures;
class Test
{
    void show() {
        System.out.println("Test Class");
    }
}
public class AnnotationsClass extends Test
{
    @Override
    void show()
    {
        System.out.println("Annotation Class");
    }
    public static void main(String[] args) {
        Test t = new AnnotationsClass();
        t.show();
    }
}
