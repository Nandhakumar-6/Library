package librarypackage;

public class Booklogic 
{
   Book[] books = new Book[3];
   
   private int count; 
   public int getCount()
    {
    	return count;
    }
   
  public void addBook(Book book)
  {
	  for(int i=0; i< books.length; i++)
	  {
		  if(books[i]== null)
		  {
			  books[i]= book;
			  count++;
			  System.out.println("Book "+book.getBookId()+" is added to rack no"+ (i+1));
			  break;
		  }
	  }
  }
  
  public boolean searchById(int bookId) 
  {
	  int i=0;
	  for(Book book: books)
	  {
		  if(book != null && book.getBookId()== bookId)
		  {
			  System.out.println(book+ "is present at rack no ::"+ (i+1));
			  return false;
		  }
	  }
	return true;
	  
  }
  public void deleteById(int bookId)
  {
	  for (int i = 0; i < books.length; i++) 
	  {
		if(books[i] != null && books[i].getBookId()==bookId)
		{
			books[i] = null;
			count--;
			System.out.println("Book with Id"+bookId+"is removed from the rack no"+(i+1));
			return;
		}
	  }
	  System.out.println("Book with Id"+bookId+ "is not present in this Library...!!!");
  }
  
  public void display()
  {
	  int i=0;
	  for(Book book: books)
	  {
		  if(book != null)
		  {
			  System.out.println(book+"is present at rack no:: "+(i+1));
		  }
		  i++;
	  }
  }
  
   
}
