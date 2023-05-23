package librarypackage;

public class Book
{
    private int bookId;
    private String bookname;
    private String Author;
    private double bookprice;
	
    public Book() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String bookname, String author, double bookprice) 
	{
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.Author = author;
		this.bookprice = bookprice;
	}

	public int getBookId() 
	{
		return bookId;
	}

	public void setBookId(int bookId) 
	{
		this.bookId = bookId;
	}

	public String getBookname() 
	{
		return bookname;
	}

	public void setBookname(String bookname)
	{
		this.bookname = bookname;
	}

	public String getAuthor() 
	{
		return Author;
	}

	public void setAuthor(String author) 
	{
		Author = author;
	}

	public double getBookprice() 
	{
		return bookprice;
	}

	public void setBookprice(double bookprice) 
	{
		this.bookprice = bookprice;
	}

	@Override
	public String toString()
	{
		return "Book [bookId=" + bookId + ", bookname=" + bookname + ", Author=" + Author + ", bookprice=" + bookprice
				+ "]";
	}
	   
    
}
