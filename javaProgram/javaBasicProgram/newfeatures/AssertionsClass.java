package newfeatures;

import java.util.Scanner;

public class AssertionsClass
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any number between 1 and 10: ");
        int x=s.nextInt();
        assert((x>0)&&(x<=10));
        System.out.println(x);
    }
}
