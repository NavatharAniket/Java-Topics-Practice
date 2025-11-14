/*
3. Constructor Overloading
Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.
*/

class Book
{
	String tittle,author;
	int price;
	
	Book(String tittle,String author)
	{
		this.tittle = tittle;
		this.author = author;
	}
	
	Book(String tittle,String author, int price)
	{
	this.tittle = tittle;
	this.author=author;
	this.price = price;
	}
	public static void main(String[] args)
	{
		Book b1= new Book("Tittle1","Author name");
		System.out.println(b1.tittle);
		System.out.println(b1.author);

		Book b2= new Book("tittle2","Author Name","Price");
		System.out.println(b2.tittle);
		System.out.println(b2.author);
		System.out.println(b2.price);
	}
}

