public class AccountTest //Client Code
{
    public static void main (String[] args)
    {
        Account myAccount = new Account("1234", 10000.0);  //Create account
        myAccount.activate(); 

        myAccount.suspend();

        myAccount.deposit(1000.0); //Updates balance after deposit
        myAccount.withdraw(100.0); //Updated balance after withraw

        myAccount.close(); //A message: "Account is already closed" pops up.
        myAccount.activate(); //A message: "You cannot activate a closed account" pops up.
        myAccount.suspend(); //A message: "You cannot activate a closed account" pops up.

        myAccount.withdraw(); //Disallowed, display current balance
        myAccount.deposit(1000.0); //Disallowed, display current balance

    }
}
