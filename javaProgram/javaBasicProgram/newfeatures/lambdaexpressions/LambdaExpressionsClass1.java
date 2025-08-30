package newfeatures.lambdaexpressions;
@FunctionalInterface
interface Test1
{
    void show();
}
public class LambdaExpressionsClass1
{
    public static void main(String[] args) {
        Test1 t=()->System.out.println("Welcome");
        t.show();
    }
}
