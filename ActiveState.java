public class ActiveState implements AccountState
{
    @Override
    public void deposit(Account account, double amount)
    {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit successful");
        System.out.println(account);
    }

    @Override
    public void withdraw(Account account, double amount)
    {
        if(amount > account.getBalance() )
        {
            System.out.println("Insufficient balance");
        }

        else
        {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawal successful");
        }
        System.out.println(account);
    }

    @Override
    public void activate(Account account)
    {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend(Account account)
    {
        account.setAccountState(new SuspendedState() );
        System.out.println("Account is suspended!");
    }

    @Override
    public void close(Account account)
    {
        account.setAccountState(new ClosedState() );
        System.out.println("Account is closed!");
    }
}
