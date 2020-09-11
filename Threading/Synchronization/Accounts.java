import java.util.Scanner;
public class Account implements Runnable {
private int balance;
Account()
{
    balance=0;
    }
Account(int balance)
{
    this.balance=balance;
}
@Override
public String toString()
{
    return ("The Customer account balance is "+ balance);
}
@Override
public void run() {
    // TODO Auto-generated method stub
    while(true)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Press 1 to withdraw and 2 to deposit and 3 to exit");
    int option=sc.nextInt();
    System.out.println("Enter amount ");
    int amount=sc.nextInt();
    if(option==1)
    Withdraw(amount);
    else if(option==2)
    Deposit(amount);
    else
        break;
    }
    }
public synchronized void Withdraw(int amount)
{
   
    if(balance>=amount)
    {
        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        balance=balance-amount;
        System.out.println( amount+" rs. has been withdrawn the updated balance is "+balance);
    }
    else
    {
        System.out.println("low Balance!");
    }
}
public void Deposit(int amount)
{
        balance=balance+amount;
        System.out.println( "the updated balance is "+balance);
   
}}
