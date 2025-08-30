package exception.checked;
public class ClassLoadExample {
    public static void main(String[] args) {
        try {
            Class<?> myClass = Class.forName("com.example.NonExistentClass");
            System.out.println("Class loaded: " + myClass.getName());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
    }
}
