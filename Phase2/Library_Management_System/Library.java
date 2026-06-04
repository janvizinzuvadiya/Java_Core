import java.util.ArrayList;

public class Library {


        public ArrayList<Book> books = new ArrayList<Book>();
        public ArrayList<User> users = new ArrayList<User>();

        public Library()
        {
            books.add(new Book(20001, "The Great Gatsby", "F. Scott Fitzgerald", true,BookCategory.BIOGRAPHY));
            books.add(new Book(20002, "To Kill a Mockingbird", "Harper Lee", true,BookCategory.THRILLER));
            books.add(new Book(20003, "1984", "George Orwell", true,BookCategory.HISTORY));

            users.add(new User(1, "John Doe"));
            users.add(new User(2, "Jane Smith"));
            users.add(new User(3, "Bob Johnson"));
        }

        public void lendBook(int isbn, int userId)
        {
           Book targetBook = null;
           User targetUser = null;

           for(Book b: books)
           {

                if(b.getIsbn() == isbn)
                {
                    targetBook = b;
                    break;
                }
           }
           for (User u : users) 
            {
                if (u.getUserId() == userId) 
                {
                    targetUser = u;
                    break; 
                }
            }

           if(targetUser == null)
           {
                System.out.println("Transaction Failed: No user profile found matching User ID: " + userId);
                return;
           }
           if(targetBook == null)
           {
                System.out.println("Transaction Failed: No book found matching ISBN: " + isbn);
                return;
           }

           if(targetBook.isAvailable() == false)
           {
                System.out.println("Transaction Failed: '"+targetBook.getTitle()+"' is currently unavailable.");
                return;
           }

           targetBook.setAvailable(false);

           System.out.println("\n[SUCCESSFUL LEND]");
           System.out.println("Book Title : " + targetBook.getTitle());
           System.out.println("Issued To  : " + targetUser.getName() + " (ID: " + targetUser.getUserId() + ")");
           System.out.println("----------------------------------------");
        }

        public void returnBook(int isbn)
        {
            Book targetBook = null;
            for(Book b: books)
            {
                if(b.getIsbn() == isbn)
                {
                    targetBook = b;
                    break;
                }
            }

            if(targetBook == null)
            {
                System.out.println("Transaction Failed: No book found matching ISBN: " + isbn);
                return;
            }

            if(targetBook.isAvailable() == true)
            {
                System.out.println("Transaction Failed: '"+targetBook.getTitle()+"' is already available.");
                return;
            }

            targetBook.setAvailable(true);
            System.out.println("\n[SUCCESSFUL RETURN]");
            System.out.println("Book Title : " + targetBook.getTitle());
            System.out.println("----------------------------------------");
        }

    }

    

 