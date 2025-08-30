package collectionsframework.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class EmpNoComparator implements Comparator<Emp>
{
    public int compare(Emp e1, Emp e2)
    {
        if(e1.empNo>e2.empNo)
            return 1;
        else if(e1.empNo<e2.empNo)
            return -1;
        else
            return 0;
    }
}
class NameComparator implements Comparator<Emp>
{
    public int compare(Emp e1, Emp e2)
    {
        return e1.name.compareTo(e2.name);
    }
}
class SalaryComparator implements Comparator<Emp>
{
    public int compare(Emp e1, Emp e2)
    {
        if(e1.salary>e2.salary)
            return 1;
        else if(e1.salary<e2.salary)
            return -1;
        else
            return 0;
    }
}
public class ComparatorClass
{
    public static void main(String[] args) {
        Emp e1=new Emp(101, "Nagraj", 5000.00f);
        Emp e2=new Emp(104, "Panchal", 5500.00f);
        Emp e3=new Emp(102, "Jyoti", 6000.00f);
        Emp e4=new Emp(103, "Mounesh", 4500.00f);
        Emp e5=new Emp(105, "Mahadev", 6500.00f);
        ArrayList<Emp> al = new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);
        System.out.println(al);
        Collections.sort(al,new EmpNoComparator());
        System.out.println(al);
        Collections.sort(al,new NameComparator());
        System.out.println(al);
        Collections.sort(al,new SalaryComparator());
        System.out.println(al);
    }
}
