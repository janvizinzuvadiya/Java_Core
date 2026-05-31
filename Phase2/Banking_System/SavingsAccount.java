package Phase2.Banking_System;

public class SavingsAccount extends BankAccount {
    
    int interestRate;

    public SavingsAccount(int accountNumber,String accountHolderName,double balance)
    {
        super(accountNumber,accountHolderName,balance);
    }

     public void applyInterest()
    {
        System.out.println("Interest applied to Current Account");
    }
}
