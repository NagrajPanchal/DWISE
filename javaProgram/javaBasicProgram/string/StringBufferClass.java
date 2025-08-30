package string;
public class StringBufferClass
{
    public static void main(String[] args) {
        // Create a StringBuffer instance
        StringBuffer sb = new StringBuffer("Hello");
        // Append a string
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World
        // Insert a string at a specific position
        sb.insert(6, "Java "); // Insert "Java " at index 6 (after "Hello ")
        System.out.println("After insert: " + sb); // Output: Hello Java World
        // Replace a substring
        sb.replace(11, 16, "Universe"); // Replace "World" with "Universe"
        System.out.println("After replace: " + sb); // Output: Hello Java Universe
        // Delete a substring
        sb.delete(6, 11); // Delete "Java "
        System.out.println("After delete: " + sb); // Output: Hello Universe
        // Reverse the StringBuffer
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: esrevinU olleH
        // Get the length of the StringBuffer
        System.out.println("Length: " + sb.length());
        // Get the capacity of the StringBuffer
        System.out.println("Capacity: " + sb.capacity());
        // Convert StringBuffer to String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
    }
}
