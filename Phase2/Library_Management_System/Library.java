import java.util.ArrayList;

public class Library {

        public ArrayList<Book> books = new ArrayList<Book>();
        public ArrayList<User> users = new ArrayList<User>();

        public Library()
        {
            books.add(new Book(20001, "The Great Gatsby", "F. Scott Fitzgerald", true,BookCategory.BIOGRAPHY));
            books.add(new Book(20002, "To Kill a Mockingbird", "Harper Lee", true,BookCategory.THRILLER));
            books.add(new Book(20003, "1984", "George Orwell", true,BookCategory.FICTION));
            books.add(new Book(20004, "Effective Java", "Joshua Bloch", true,BookCategory.SCIENCE));
            books.add(new Book(20005, "Clean Code", "Robert Martin", true,BookCategory.SCIENCE));

            users.add(new User(1001, "Alice"));
            users.add(new User(1002, "John Doe"));
            users.add(new User(1003, "Jane Smith"));
            users.add(new User(1004, "Bob Johnson"));
        }

        public void checkOutstandingFees(int userId)
        {
            User targetUser = findUser(userId);
            if(targetUser == null)
            {
                System.out.println("❌ Transaction Failed: No user profile found matching User ID: " + userId);
                return;
            }

            if(targetUser.getFineBalance() > 0)
            {
                System.out.println("User " + targetUser.getName() + " has an outstanding fine of " + targetUser.getFineBalance());
            }
            else
            {
                System.out.println("User " + targetUser.getName() + " has no outstanding fines");
            }

        }
        
        public void payFine(int userId,double paymentAmount)
        {
            User targetUser = findUser(userId);
            double fineBalance = targetUser.getFineBalance();

            if(targetUser == null)
            {
                System.out.println("❌ Transaction Failed: No user profile found matching User ID: " + userId);
                return;
            }
            if(paymentAmount <= 0 )
            {
                System.out.println("Payment Rejected: Amount must be greater than $0.");
                return;
            }

            if(paymentAmount >= fineBalance)
            {
                double change = paymentAmount - fineBalance;
                targetUser.setFineBalance(0.0);

                System.out.println("💳 [PAYMENT SUCCESS] Fines fully cleared for " + targetUser.getName() + ".");
                if (change > 0) {
                    System.out.printf("Returned change: $%.2f%n", change);
                }
            }
            else 
            {
                double newfineBalance = fineBalance - paymentAmount;
                targetUser.setFineBalance(newfineBalance);
                System.out.printf("💳 [PAYMENT SUCCESS] Partial payment processed. Remaining fine balance for %s: $%.2f%n", targetUser.getName(), newfineBalance);
            }

        }

        public void listAllUsers()
        {
            System.out.println("\n[ALL USERS REGISTERED IN LIBRARY]");
            if(users.isEmpty())
            {
                System.out.println("No users found");
                return;
            }

            for(User u:users)
            {
                u.displayUserDetails();
            }
        }

        public void listAllBooks()
        {
            System.out.println("\n[ALL BOOKS AVAILABLE IN LIBRARY]");
            if(books.isEmpty())
            {
                System.out.println("No books available in library currently");
                return;
            }

            for(Book b:books)
            {
                b.displayBookDetails();
            }
        }

        public void searchBook(String bookName)
        {
            Book targetBook = null;
            for (Book b: books)
            {
                if(b.getTitle().equals(bookName))
                {
                    targetBook = b;
                    break;
                }
            }

            if(targetBook == null)
            {
                System.out.println("Book not Found");
            }

            System.out.println("\n[BOOK DETAILS]");
            targetBook.displayBookDetails();

        }

        public void lendBook(int isbn, int userId)
        {
           Book targetBook = findBook(isbn);
           User targetUser = findUser(userId);

           if(targetUser == null)
           {
                System.out.println("❌ Transaction Failed: No user profile found matching User ID: " + userId);
                return;
           }
           if(targetBook == null)
           {
                System.out.println("❌ Transaction Failed: No book found matching ISBN: " + isbn);
                return;
           }
           if (targetUser.getFineBalance() > 0) 
            {
                System.out.printf("❌ TRANSACTION DENIED: %s has an outstanding fine of $%.2f. Account is locked!%n", 
                              targetUser.getName(), targetUser.getFineBalance());
                return;
            }

           if(targetUser.getBorrowedCount() >= 3)
           {
                System.out.println("❌ Transaction Denied: " + targetUser.getName() + 
                                " has reached the maximum borrowing limit of 3 books!");
                return;
           }    

           if(targetBook.isAvailable() == false)
           {
                System.out.println("Transaction Failed: '"+targetBook.getTitle()+"' is currently unavailable.");
                return;
           }

           targetBook.setAvailable(false);
           targetUser.setBorrowedCount(true);

           System.out.println("\n[SUCCESSFUL LEND]");
           System.out.println("Book Title : " + targetBook.getTitle());
           System.out.println("Issued To  : " + targetUser.getName() + " (ID: " + targetUser.getUserId() + ")");
           System.out.println("Borrowed Books  : " + targetUser.getBorrowedCount());
           System.out.println("----------------------------------------");
        }
        
        public void returnBook(int isbn, int userId,int daysLate)
        {
            Book targetBook = findBook(isbn);
            User targetUser = findUser(userId);
            if(targetBook == null)
            {
                System.out.println("❌ Transaction Failed: No book found matching ISBN: " + isbn);
                return;
            }

            if(targetBook.isAvailable() == true)
            {
                System.out.println("❌ Transaction Failed: '"+targetBook.getTitle()+"' is already available.");
                return;
            }

            targetBook.setAvailable(true);
            targetUser.setBorrowedCount(false);

            System.out.println("\n🔄[SUCCESSFUL BOOK RETURN]");
            System.out.println("Book Title : " + targetBook.getTitle());
            System.out.println("Returned By :" + targetUser.getName());
            System.out.println("Books Left : " + targetUser.getBorrowedCount());

            if(daysLate > 0)
            {
                double fineRatePerDay = 2.50;
                double totalFine = daysLate * fineRatePerDay ;

                targetUser.addFine(totalFine);

                System.out.printf("⚠️ LATE WARNING: Book returned %d days past due. A fine of $%.2f has been added to %s's account.%n", 
                              daysLate, totalFine, targetUser.getName());
            }
            System.out.println("----------------------------------------");
        }

        public Book findBook(int isbn)
        {
            for (Book b: books)
            {
                if(b.getIsbn()== isbn)
                {
                    return b;
                }
            }
            return null;
        }
        public User findUser(int userId)
        {
            for(User u:users)
            {
                if(u.getUserId() == userId)
                {
                    return u;
                }
            }
            return null;
        }

    }