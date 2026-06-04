public class Main 
{
    public static void main(String[] args) {
        Library centralLibrary = new Library();

        // Populate library records
        centralLibrary.books.add(new Book(97801, "Effective Java", "Joshua Bloch", true,BookCategory.SCIENCE));
        centralLibrary.books.add(new Book(97802, "Clean Code", "Robert Martin", true,BookCategory.SCIENCE));
        centralLibrary.users.add(new User(701, "Alice"));

        System.out.println("--- Execution Attempt 1: Valid Lend ---");
        centralLibrary.lendBook(97801, 701);

        System.out.println("\n--- Execution Attempt 2: Target Book is Now Unavailable ---");
        centralLibrary.lendBook(97801, 701);

        System.out.println("\n--- Execution Attempt 3: Testing Invalid Records ---");
        centralLibrary.lendBook(97801, 701);

    }   
       


}
