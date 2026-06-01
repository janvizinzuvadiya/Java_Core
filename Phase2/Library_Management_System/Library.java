import java.util.ArrayList;

public class Library {


        private ArrayList<Book> books = new ArrayList<Book>();
        private ArrayList<User> users = new ArrayList<User>();

        public Library()
        {
            books.add(new Book(20001, "The Great Gatsby", "F. Scott Fitzgerald", true));
            books.add(new Book(20002, "To Kill a Mockingbird", "Harper Lee", true));
            books.add(new Book(20003, "1984", "George Orwell", true));

            users.add(new User(1, "John Doe"));
            users.add(new User(2, "Jane Smith"));
            users.add(new User(3, "Bob Johnson"));
        }

        public void lendBook(int isbn, int userId)
        {
           Book targetBook = null;
           User targeUser = null;

           for(Book b: books)
           {
                if(b.getIsbn() == isbn)
                {
                    targetBook = b;
                    break;
                }
           }
        }
    
}
