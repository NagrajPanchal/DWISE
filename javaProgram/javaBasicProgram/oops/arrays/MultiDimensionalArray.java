package oops.arrays;

public class MultiDimensionalArray
{
    public static void main(String[] args){

        // Multidimensional array declaration
        int[][] arr;

        // Initializing the size of row and column respectively
        arr = new int[1][3];

        // Initializing the values
        arr[0][0] = 3;
        arr[0][1] = 5;
        arr[0][2] = 7;

        // Display the values using index
        System.out.println("arr[0][0] = " + arr[0][0]);
        System.out.println("arr[0][1] = " + arr[0][1]);
        System.out.println("arr[0][2] = " + arr[0][2]);
    }
}
