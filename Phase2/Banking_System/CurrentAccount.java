package Phase2.Banking_System;

public class CurrentAccount extends BankAccount {

    int interestRate;

    public CurrentAccount(int accountNumber,String accountHolderName,double balance)
    {
        super(accountNumber,accountHolderName,balance);
    }

    public void applyInterest()
    {
        System.out.println("Interest applied to Current Account");
    }

    
    
}
