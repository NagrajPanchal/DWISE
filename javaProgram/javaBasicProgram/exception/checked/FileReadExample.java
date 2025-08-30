package exception.checked;
import java.io.FileReader;
import java.io.IOException;
public class FileReadExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("nonExistentFile.txt");
            // Further operations with reader
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}