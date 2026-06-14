public class Book 
{
   private int isbn;
   private String title;
   private String author;
   private boolean isAvailable;
   private BookCategory category;
   
   public Book(int isbn, String title, String author, boolean isAvailable,BookCategory category) {
    this.isbn = isbn;
    this.title = title;                                                        
    this.author = author;
    this.isAvailable = isAvailable;
    this.category = category; 
    
   }
 
    public BookCategory getCategory() { return category; }
    public void setCategory(BookCategory category) { this.category = category; }

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

    public void displayBookDetails()
    {
        System.out.println("------------------------------------------------");
        System.out.println("Title    : " + title);
        System.out.println("Author   : " + author);
        System.out.println("ISBN     : " + isbn);
        System.out.println("Category : " + category.getCategoryName());
        System.out.println("Status   : " + (isAvailable ? "Available" : "Checked Out"));
        System.out.println("------------------------------------------------");
    }

  

}
