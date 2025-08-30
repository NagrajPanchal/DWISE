package newfeatures;
@FunctionalInterface
interface Test2
{
    void show();
}
public class FunctionalInterfaceAnnotation
{
    public static void main(String[] args) {
    Test2 t2 = new Test2() {
        @Override
        public void show() {
            System.out.println("Welcome");
        }
    };
    t2.show();
}
}
