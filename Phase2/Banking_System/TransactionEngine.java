public class TransactionEngine 
{

    public void logTransaction(BankAccount account, String type, double amount)
    {
        System.out.println("\nIn TransactionEngine.logTransaction");

        String data = 
        "Transaction Type :"+type + "\n" + 
        "Timestamp :"+java.time.LocalDateTime.now()+"\n" + 
        "Amount :"+amount + "\t" + "\n" ;

        System.out.println("----------------------------------------\n"
                                    +data+
                           "\n--------------------------------------\n");
    }
}
