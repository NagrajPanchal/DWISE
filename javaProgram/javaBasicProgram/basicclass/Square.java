package basicclass;

class Square
{
    public static void squareMethodWithArguments(int a) {
        // Area of basicclass.Square is = side * side
        int res = a * a;
        System.out.println("Area of basicclass.Square " + res);
    }
}

class Calculate
    {
        public static void main(String[] args)
        {
            Square.squareMethodWithArguments(5);
        }

    }



