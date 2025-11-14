/*
Q7. WAP to create POJO class name as Book  with field id,name and price and author and input the book details and display it.

*/

import java.util.Scanner;
class Book
{
	private int id;
	private String name;
	private String author;
	
	
	public void setid(int num)
	{
		this.id=num;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setauthor(String author)
	{
		this.author=author;
	}
	public void show()
	{
		System.out.println("bookd "+id+" bookname "+name+" bookAuthor "+author);
	}
}

class BookApp
{
	public static void main(String[] args)	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id number");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name number");
		String name=sc.nextLine();
		
		System.out.println("Enter Aouthor number");
		String author=sc.nextLine();

		Book p=new Book();
		p.setid(id);
		p.setName(name);
		p.setauthor(author);
		p.show();


		
	}
}