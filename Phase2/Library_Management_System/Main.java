import java.util.Scanner;


public class Main 
{
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        Scanner sc = new Scanner(System.in);

        int choice;
        do
        {

            System.out.println("\n How can I Help You ?");
            System.out.println("1. Lend a Book");
            System.out.println("2. Return a Book");
            System.out.println("3. Search a Book");
            System.out.println("4. List all Books");
            System.out.println("5. List all Users");
            System.out.println("6. Check outstanding fees");
            System.out.println("7. Pay Fine");
            System.out.println("8. Exit");

            System.out.print("\nEnter your choise : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter Book ISBN : ");
                    int isbn = sc.nextInt();
                    System.out.print("Enter User ID : ");
                    int userId = sc.nextInt();

                    centralLibrary.lendBook(isbn, userId);
                    break;

                case 2:
                    System.out.print("Enter Book ISBN : ");
                    int Isbn = sc.nextInt();
                    System.out.print("Enter User ID : ");
                    int UserId = sc.nextInt();
                    System.out.print("Enter Days Late : ");
                    int dayLate = sc.nextInt();

                    centralLibrary.returnBook(Isbn, UserId, dayLate);
                    break;

                case 3:
                    System.out.print("Enter Book Name : ");
                    String bookName = sc.nextLine();
                    sc.next();

                    centralLibrary.searchBook(bookName);
                    break;

                case 4:
                    centralLibrary.listAllBooks();
                    break;

                case 5:
                    centralLibrary.listAllUsers();
                    break;

                case 6:
                    System.out.println("Enter User Id");
                    int user_Id = sc.nextInt();

                    centralLibrary.checkOutstandingFees(user_Id);
                    break;

                case 7:
                    System.out.println("Enter User Id");
                    int Id = sc.nextInt();
                    System.out.println("Enter Payment Amount");
                    double paymentAmount = sc.nextDouble();

                    centralLibrary.payFine(Id, paymentAmount);
                    break;

                case 8:
                    System.out.println("Thank you for using the Library Management System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }while(choice != 8);

    }   
}
