public class User {
    private int userId;
    private String name;
    private int borrowedCount;
    private double fineBalance;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedCount = 0;
        this.fineBalance = 0.0;
    }

    public int getUserId() { return userId; }
    public String getName() { return name; }
    public int getBorrowedCount() { return borrowedCount; }
    public double getFineBalance() { return fineBalance; }

    public void addFine(double fineAmount)
    {
        this.fineBalance += fineAmount;
    }

    public void setFineBalance(double fineBalance)
    {
        this.fineBalance = fineBalance;
    }

    public void setBorrowedCount(boolean isLent)
    {
        if(isLent)
        {
            this.borrowedCount++;
        }
        else
        {
            this.borrowedCount--;
        }
    }

    public void displayUserDetails()
    {
        System.out.println("------------------------------------------------");
        System.out.println("User ID        : " + userId);
        System.out.println("Name           : " + name);
        System.out.println("Borrowed Books : " + borrowedCount);
        if(fineBalance>0) System.out.println("Fine Balance   : $" + fineBalance);
        System.out.println("------------------------------------------------");
    }

}
