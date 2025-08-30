package basicclass;
import java.util.Scanner;
public class ScannerClass
{
    public static void main(String[] args) {
        System.out.print("Enter any Number :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i=1;
        while(i<=x)
        {
            int y = sc.nextInt();
            System.out.println(i+")."+y);
            i++;
        }
    }
}
