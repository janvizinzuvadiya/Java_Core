package Phase2.Banking_System;

public class BankAccount  {

    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private TransactionEngine engine;

    public BankAccount(int accountNumber,String accountHolderName,double balance,TransactionEngine engine) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.engine = engine;
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
        }
        else
        {
            System.out.println("Invalid amount");
        }

        engine.logTransaction(this, "Deposite", amount);
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
        }
        engine.logTransaction(this, "Withdrawal", amount);
    }



    @Override
    public String toString()
    {
        String data = 
        "Account Number :" + accountNumber + "\n" + 
        "Account Holder Name :" + accountHolderName + "\n" + 
        "Balance :" + balance;

        return data;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(o == null || getClass() != o.getClass())
        {
            return false;
        }
        BankAccount that = (BankAccount) o;
        return accountNumber == that.accountNumber &&
                Double.compare(that.balance, balance) == 0 &&
                Objects.equals(accountHolderName, that.accountHolderName) &&
                Objects.equals(engine, that.engine);
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(accountNumber, accountHolderName, balance, engine);
    }

}
