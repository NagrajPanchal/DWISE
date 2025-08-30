package newfeatures.lambdaexpressions;
@FunctionalInterface
interface Test3
{
    int add(int a,int b);
}
public class LambdaExpressionClass3
{
    public static void main(String[] args) {
        Test3 t=(a, b)->a+b;
        int x=t.add(5,3);
        System.out.println(x);
    }
}
