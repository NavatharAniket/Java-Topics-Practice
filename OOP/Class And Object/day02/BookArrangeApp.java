/*
Q2. WAP to create POJO class name as Book with field id,name and authors and price and arrange  all books in descending order by using price.
*/

import java.util.Stack;
class Book
{
	private  int id;
	private String name;
	private String authors;
	private float price;
		
	public void setId(int i)
	{
		id=i;
	}
	public int getId()
	{
		return id;
	}

	public void setName(String s)
	{
		name=s;
	}	
	public String getName()
	{
		return name;
	}

	public void setAuthors(String n)
	{
		authors=n;
	}

	public String getAuthors()
	{
		return authors;
	}
	
	public void setPrice(float f)	
	{
		price=f;
	}
	public float getPrice()
	{
		return price;
	}
	
}

class Arrange
{
	Stack<Book>arr = new Stack<>();
	public void pushBook(Book ...b)
	{
		for(int i=0;i<b.length;i++)
		{
			arr.push(b[i]);
		}
	}

	public void arrangeBook()
	{
		for(int i=0;i<arr.size();i++)
		{
			for(int j=0;j<arr.size()-1;j++)
			{	
				Book b1=arr.get(j);
				Book b2=arr.get(j+1);

				if(b1.getPrice() < b2.getPrice())
				{		
					arr.set(j,b2);
					arr.set(j+1,b1);
				}
			}
		}		
	}	
	
	public void printStack()
	{
		while(arr.size()>0)
		{
			float p = arr.pop().getPrice();
			System.out.println(p+" ");
		}
	}
}


public class BookArrangeApp
{
	public static void main(String[] args)
	{
		Book b=new Book();
			b.setId(0);
			b.setName("Math");
			b.setAuthors("Aniket");
			b.setPrice(100f);

		Book b1=new Book();
			b1.setId(1);
			b1.setName("c");
			b1.setAuthors("jay");
			b1.setPrice(1000f);

		Book b2=new Book();
			b2.setId(2);
			b2.setName("Science");
			b2.setAuthors("Onkar");
			b2.setPrice(400f);

		Book b3=new Book();
			b3.setId(3);
			b3.setName("English");
			b3.setAuthors("Kartik");
			b3.setPrice(300f);

		Book b4=new Book();
			b4.setId(4);
			b4.setName("java");
			b4.setAuthors("Rudra");
			b4.setPrice(500f);

		Book b5=new Book();
			b5.setId(5);
			b5.setName("Cpp");
			b5.setAuthors("Sejal");
			b5.setPrice(50f);

		Arrange a=new Arrange();
		a.pushBook(b,b1,b2,b3,b4,b5);
		a.arrangeBook();
		a.printStack();
	}
}