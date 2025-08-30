package newfeatures.enumeration;
public class EnumerationsClass3
{
    enum Day{Mon, Tue, Wed, Thu, Fri, Sat, Sun}
    public static void main(String[] args) {
        Day d1=Day.valueOf("Sat");
        Day d2=Day.Sun;
        System.out.println(d1.ordinal());
        System.out.println(d2.ordinal());
    }
}
