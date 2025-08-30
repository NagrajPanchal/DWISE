package string;
public class StringMethods
{
    String s1 = "Nagraj";
    String s2 = "Panchal";
    void equalsMethod()
    {
        System.out.println("String Equals Methods "+s1+" "+s2);
        if(s1.equals(s2))
            System.out.println("Strings are Equals");
        else
            System.out.println("Strings are not equals");
    }
    void lengthMethod()
    {
        System.out.println('"'+s1+'"'+" Length of String is : "+s1.length());
        System.out.println('"'+s2+'"'+" Length of String is : "+s2.length());
    }
    void charAtMethod()
    {
        System.out.println('"'+s1+'"'+" CharAt Position is : "+s1.charAt(0));
        System.out.println('"'+s2+'"'+" CharAt Position is : "+s2.charAt(0));
    }
    void trimMethod()
    {
        String s3 = "   My      Name   is      "+s1+" "+s2;
        System.out.println("Before Trim function "+s3);
        System.out.println("After Trim Function "+s3.trim());
        System.out.println("Using Relace"+s3.replace(" ",""));
    }
    void lowerCaseMethod()
    {
        System.out.println("Convert String "+'"'+s1+'"'+" to lower Case "+'"'+s1.toLowerCase()+'"');
    }
    void upperCaseMethod()
    {
        System.out.println("Convert String "+'"'+s2+'"'+" to Upper Case "+'"'+s2.toUpperCase()+'"');
    }
    void appendMethod()
    {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        System.out.println("After appending ' World': " + sb);
        sb.append(123);
        System.out.println("After appending 123: " + sb);
        sb.append(true);
        System.out.println("After appending true: " + sb);
        char[] chars = {'!', 'J', 'a', 'v', 'a'};
        sb.append(chars, 1, 4); // Appends 'ava' from index 1 for 4 characters
        System.out.println("After appending char array: " + sb);
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
        sb.append(finalString).append(chars).append("Hello");
        StringBuilder s4 = sb;
        System.out.println(s4);
        System.out.println("Delete String :"+s4.delete(21,52));
        System.out.println("Reverse :"+sb.reverse());
    }
    void replaceMethod()
    {
        System.out.println("Replace String "+'"'+s1+'"');
        System.out.println(s1.replace('a','e'));
        System.out.println(s1.replace(s1,s2));
    }
    public static void main(String[] args) {
        StringMethods sm = new StringMethods();
        sm.equalsMethod();
        sm.lengthMethod();
        sm.charAtMethod();
        sm.trimMethod();
        sm.lowerCaseMethod();
        sm.upperCaseMethod();
        sm.appendMethod();
        sm.replaceMethod();
    }
}
