package interfaceabstract;
@java.lang.FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}
public class FunctionalInterface {
    public static void main(String[] args)
    {
        // Using a lambda expression to implement the Calculator interface
        Calculator add = (num1, num2) -> num1 + num2;
        Calculator subtract = (num1, num2) -> num1 - num2;
        Calculator multiply = (num1, num2) -> num1 * num2;
        System.out.println("Addition: " + add.operate(10, 5));
        System.out.println("Subtraction: " + subtract.operate(10, 5));
        System.out.println("Multiplication: " + multiply.operate(10, 5));
    }
}
