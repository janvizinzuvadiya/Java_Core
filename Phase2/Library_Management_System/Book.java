public class Book 
{
   private int isbn;
   private String title;
   private String author;
   private boolean isAvailable;
   
   public Book(int isbn, String title, String author, boolean isAvailable) {
    this.isbn = isbn;
    this.title = title;                                                        
    this.author = author;
    this.isAvailable = isAvailable;
   }

   public void setAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
   }

   public int getIsbn() {
    return isbn;
   }

   public String getTitle() {
    return title;
   }

   public String getAuthor() {
    return author;
   }

   public boolean isAvailable() {
    return isAvailable;
   }  

    public void DisplayBookDetails()
    {
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Available: " + isAvailable());
    }

  

}
