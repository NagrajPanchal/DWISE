package oops.arrays;

public class ArrayWithForEachLoop
{
    public static void main(String[] args)
    {
        int[] a = {12,15,24,48,56};
        for (int b : a)
        {
            if(b==15)
                continue;
            System.out.println(b);
        }
    }
}
