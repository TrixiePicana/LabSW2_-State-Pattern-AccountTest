public class Account    //Context Class
{
    private String accountNumber;
    private double balance;
    private AccountState accountState;

    public Account(String accountNumber, double balance)
    {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = accountState;
    }


    public void deposit(double depositAmount)
    {
    
    }

    public void withdraw(double withdrawAmount)
    {

    }

    public void suspend()
    {
        System.out.println("Account is suspended");
    }

    public void activate()
    {
        System.out.println("Account is already activated");
    }

    public void close()
    {
        System.out.println("Account is closed");


    }

    public String toString()
    {
        return "AccountNumber: " + accountNumber + "; " + "Balance: " + balance;
    }
}
