package encapsulation;
class Emp
{
    int age;
    void setAge(int age)
    {
        if(age<0)
            this.age=0;
        else if(age>100)
            this.age=100;
        else
            this.age=age;
    }
    int getAge()
    {
        return age;
    }
}
public class encapsulation
{
    public static void main(String[] args)
    {
        Emp e=new Emp();
        e.setAge(200);
        int x=e.getAge();
        System.out.println(x);
    }
}
