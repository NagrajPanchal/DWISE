package collectionsframework.list.arraylist;
import java.util.ArrayList;
class Emp
{
    int empNo;
    String name;
    float salary;
    Emp(int empNo, String name, float salary)
    {
        this.empNo=empNo;
        this.name=name;
        this.salary=salary;
    }
    public String toString()
    {
        return empNo+"\t"+name+"\t"+salary;
    }
}
public class ArrayListCollectionWithEmpObj
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
    }
}
