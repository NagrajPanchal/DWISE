package oops.methods;

public class MethodOverLoading
{
    // Overloading by changing the number of parameters
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloading by changing the data types of parameters
    public double add(double a, double b) {
        return a + b;
    }

    // Overloading by changing the order of data types of parameters
    public String concatenate(String s1, int num) {
        return s1 + num;
    }

    public String concatenate(int num, String s1) {
        return num + s1;
    }
    public static void main(String[] args)
    {
        MethodOverLoading mol = new MethodOverLoading();
        // Calling overloaded methods
        System.out.println("Sum of two integers: " + mol.add(10, 20)); // Calls add(int, int)
        System.out.println("Sum of three integers: " + mol.add(10, 20, 30)); // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + mol.add(5.5, 3.2)); // Calls add(double, double)
        System.out.println("Concatenation (String then int): " + mol.concatenate("Value: ", 123)); // Calls concatenate(String, int)
        System.out.println("Concatenation (int then String): " + mol.concatenate(456, " is the number")); // Calls concatenate(int, String)
    }
}
