package synchronization;
class Bank
{
    float balance=5000.00f;
    synchronized void withdraw(float amount)
    {
        try{
            System.out.println("Withdraw Started");
            if(balance<amount)
            {
                System.out.println("Less Balance, Waiting for Deposit");
                wait();
            }
            balance=balance-amount;
            System.out.println("Withdraw Completed");
        }catch(Exception e)
        {
            System.err.println(e);
        }
    }
    synchronized void deposit(float amount)
    {
        System.out.println("Deposit Started");
        balance=balance+amount;
        System.out.println("Deposit Completed");
        notify();
    }
}
class Customer1 extends Thread
{
    Bank b;
    Customer1(Bank b)
    {
        this.b=b;
    }
    public void run()
    {
        b.withdraw(8000.00f);
    }
}
class Customer2 extends Thread
{
    Bank b;
    Customer2(Bank b)
    {
        this.b=b;
    }
    public void run()
    {
        b.deposit(5000.00f);
    }
}
public class SynchronizeProgram
{
    public static void main(String[] args) {
        Bank b=new Bank();
        Customer1 c1=new Customer1(b);
        c1.start();
        Customer2 c2=new Customer2(b);
        c2.start();
    }
}
