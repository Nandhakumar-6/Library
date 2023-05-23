package librarypackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookController 
{
	static 
	{
	   System.err.println("Welcome to Sb Library \n");	
	}
    static Booklogic booklogic = new Booklogic();
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		boolean flag = true;
		boolean res = true;
		do {
			try
			{
			while(flag)
			{
				System.out.println("select an option \n");
				System.out.println("1) Add Book");
				System.out.println("2) Display the Book details");
				System.out.println("3) Delete the Book by Id");
				System.out.println("4) Search the Book by Id");
				System.out.println("5) Exit");
				System.out.println();
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1: 
					addBook(sc);
					break;
				case 2:
					display();
					break;
				case 3: 
					deleteBookById(sc);
					break;
				case 4:
					searchBookById(sc);
					break;
				case 5:
					flag = false;
					break;
				default: 
					System.out.println("Invalid selection, select option from the list");
				}
			}
			res = false;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input MisMatch");
			sc.next();
		}
	  }while(res);
		System.err.println("Thankyou for visiting Sb Library");
		sc.close();
	}
	
	public static void addBook(Scanner sc)
	{
	   System.out.println("AddIn Book");
	   
	   System.out.println("Enter the BookId");
	   int bookId = sc.nextInt();
	   System.out.println("Enter the Book Name");
	   String bookName = sc.next();
	   System.out.println("Enter the Author Name");
	   String author = sc.next();
	   System.out.println("Enter the Book price");
	   double price = sc.nextDouble();
	   Book book = new Book(bookId,bookName,author,price);
	   booklogic.addBook(book);
	   
	}
	private static void display()
	{
		if(isAvailable())
		{
			booklogic.display();
		}
		
	}
	private static boolean isAvailable()
	{
		if(booklogic.getCount() == 0)
		{
			System.out.println("There are no books in the Sb Library.....!!!!!!");
			return false;
		}
		return true;
	}
	private static void deleteBookById(Scanner sc)
	{
		if(isAvailable())
		{
			System.out.println("Enter the BookId:: ");
			int bookId = sc.nextInt();
			booklogic.deleteById(bookId);
		}
	}
	private static void searchBookById(Scanner sc)
	{
		if(isAvailable())
		{
			System.out.println("Enter the BookId:: ");
			int bookId = sc.nextInt();
			booklogic.searchById(bookId);
		}
		
	}

}
