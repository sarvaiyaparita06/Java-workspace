package September32022;

public class Account 
{
 
    private int balance = 2000;
 
    public int balance() 
    {
        return balance;
    }
 
    public void withdraw(int amount) throws InsufficientFunds 
    {
        if (amount > balance) 
        {
            throw new InsufficientFunds(
   String.format("Sorry, insufficient funds. You need more 500 to complete this transaction."));
        }
        balance = balance - amount;
    }
 
}
