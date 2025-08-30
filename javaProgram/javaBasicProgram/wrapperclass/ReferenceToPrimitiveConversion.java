package wrapperclass;

public class ReferenceToPrimitiveConversion
{
    void implicitUnboxingAutomatic()
    {
        Integer myInteger = 10;
        int myPrimitiveInt = myInteger; // Implicit unboxing
        System.out.println("Implicit unboxing : "+ myPrimitiveInt);

        Integer num1 = 5;
        Integer num2 = 3;
        int sum = num1 + num2; // Implicit unboxing of num1 and num2 before addition
        System.out.println("Implicit unboxing of num1 and num2 before addition : "+sum);
    }

    void ExplicitUnboxingManual()
    {
        Integer myInteger = 10;
        int myPrimitiveInt = myInteger.intValue(); // Explicit unboxing
        System.out.println("Explicit unboxing Integer : "+myPrimitiveInt);

        Double myDouble = 3.14;
        double myPrimitiveDouble = myDouble.doubleValue(); // Explicit unboxing
        System.out.println("Explicit unboxing Double :"+myPrimitiveDouble);
    }
    public static void main(String[] args)
    {
        ReferenceToPrimitiveConversion rtpc = new ReferenceToPrimitiveConversion();
        rtpc.implicitUnboxingAutomatic();
        rtpc.ExplicitUnboxingManual();
    }
}
