package newfeatures.lambdaexpressions;
@FunctionalInterface
interface Test2
{
    void add(int a,int b);
}
public class LambdaExpressionsClass2
{
    public static void main(String[] args) {
        Test2 t=(a, b)->System.out.println(a+b);
        t.add(5,3);
    }
}
