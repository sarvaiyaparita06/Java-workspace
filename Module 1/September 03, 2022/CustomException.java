package September032022;

public class CustomException {
	 
    public static void main(String args[]) 
    {
        Account acct = new Account();
        System.out.println("Account balance : " + acct.balance());
        System.out.println("Withdraw: 2500");
        acct.withdraw(2500);
    }
 
}
