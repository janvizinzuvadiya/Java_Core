package Phase2.Banking_System;

public class BankAccount  {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber,String accountHolderName,double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    

    public void deposit(double amount) 
    {
        if(amount >= 0)
        {
            this.balance += amount;
            System.out.println("New Balance : " + balance);
        }
        else
        {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) throws InvalidWithdrawBalance{
        
        if(amount <= 0 )
        {
            throw new InvalidWithdrawBalance("Withdrawal amount must be greater than 0");
        }
        else if(amount > balance)
        {
            throw new InvalidWithdrawBalance("Insufficient balance for withdrawal");
        }
        else
        {
            this.balance -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("New Balance : " + balance);
        }
    }

}
