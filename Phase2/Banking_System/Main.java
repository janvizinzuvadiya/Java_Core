package Phase2.Banking_System;

public class Main {

    public static void main(String[] args) {
        try {

            TransactionEngine engine = new TransactionEngine();

            BankAccount account1 = new BankAccount(123, "John", 1000, engine);

            account1.deposit(100);
            account1.withdraw(50);

            BankAccount account2 = new BankAccount(456, "Doe", 2000, engine);

            account2.deposit(200);
            account2.withdraw(100);
            account2.withdraw(5000);
        }
        catch(InvalidWithdrawBalance e)
        {
            System.out.println(e);
        }
    }

}
