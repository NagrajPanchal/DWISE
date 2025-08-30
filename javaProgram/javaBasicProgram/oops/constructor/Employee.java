package oops.constructor;

public class Employee
{
    int empID;
    long salary;
    void Employee(int empId,long salary)
    {
        this.empID = empId;
        this.salary = salary;
    }
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.Employee(12,1200000);
        Employee e2 = new Employee();
        e2.Employee(11,1600000);
        System.out.println("Employee ID :\t"+e1.empID+"\tSalary :\t"+e1.salary);
        System.out.println("Employee ID :\t"+e2.empID+"\tSalary :\t"+e2.salary);
    }
}
