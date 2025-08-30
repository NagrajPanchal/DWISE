package basicclass;
import java.util.Date;
public class DateClass
{
    public static void main(String[] args) {
        Date d = new Date();
        int x = d.getHours();
        int y = d.getMinutes();
        int z = d.getSeconds();
        System.out.println("Time : "+x+":"+y+":"+z);
        d.setMonth(8);
        d.setYear(2025);
        int a = d.getDate();
        int b = d.getMonth();
        int c = d.getYear();
        System.out.println("Date : "+a+"/"+b+"/"+c);
    }
}
