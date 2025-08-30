package wrapperclass;

public class PrimitiveToReferenceConversion
{
    public static void main(String[] args) {
        // Autoboxing example
        int age = 30;
        Integer ageObject = age; // Autoboxed from int to Integer
        System.out.println("Autoboxed Integer: " + ageObject);

        // Explicit conversion using valueOf()
        char gradeChar = 'A';
        Character gradeObject = Character.valueOf(gradeChar); // Explicitly converted
        System.out.println("Explicitly converted Character: " + gradeObject);

        double primitiveDouble = 3.14;
        Double referenceDouble = Double.valueOf(primitiveDouble); // Explicit conversion
        System.out.println("Explicit conversion Double : " + referenceDouble);

        // Explicit conversion using constructor (less common)
        boolean isActivePrimitive = true;
        Boolean isActiveObject = isActivePrimitive; // Explicitly converted
        System.out.println("Explicitly converted Boolean (via constructor): " + isActiveObject);
    }
}
