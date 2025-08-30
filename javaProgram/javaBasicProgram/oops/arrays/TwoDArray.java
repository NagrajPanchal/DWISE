package oops.arrays;

public class TwoDArray
{
    public static void main(String[] args)
    {
        int[] [] arr;
        arr = new int[2][2];
        arr [0][0] = 2;
        arr [0][1] = 4;
        arr [1][0] = 3;
        arr [1][1] = 5;
        System.out.println(arr [0][0]+"\t"+arr [0][1]);
        System.out.println(arr [1][0]+"\t"+arr [1][1]);
    }
}
