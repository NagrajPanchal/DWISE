package exception;
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0; // This will cause an ArithmeticException

        try {
            int result = numerator / denominator; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero!");
            System.err.println("Exception details: " + e.getMessage());
        }

        // Another example: NullPointerException
        String text = null;
        try {
            System.out.println("Length of text: " + text.length()); // Accessing method on a null reference
        } catch (NullPointerException e) {
            System.err.println("Error: Attempted to use a null reference!");
            System.err.println("Exception details: " + e.getMessage());
        }
    }
}
