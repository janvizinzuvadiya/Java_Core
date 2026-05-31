package Phase2.Banking_System;

public class CurrentAccount extends BankAccount {

    double overdraftLimit;

    public CurrentAccount(int accountNumber,String accountHolderName,double balance)
    {
        super(accountNumber,accountHolderName,balance);
    }

    public void withdraw(double amount) throws InvalidWithdrawBalance
    {
       double balance = getBalance();
       if(amount > balance + overdraftLimit)
       {
            throw new InvalidWithdrawBalance("Insufficiant Balance ");
       }
       else
       {
            balance -= amount;
       }
    }
    
}
