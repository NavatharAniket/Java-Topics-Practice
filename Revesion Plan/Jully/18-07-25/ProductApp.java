/*
Q3. WAP to create ArrayList and store Product details means we have 10 products with field id,name and price and
 use array of objects concept and store 10 products in ArrayList and find the occurrence of product whose price is same 
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
class Product
{
	int id;
	String name;
	double price;
	public Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getPrice()
	{
		return price;
	}

	public String toString()
	{
		return "id "+id+" name "+name+" price "+price;
	}
	

}
class ProductApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<Product>list=new ArrayList<Product>();

		do
		{
			System.out.println("Enter your choice");	
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter id");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter name");
					String name=sc.nextLine();
					System.out.println("Enter Price");
					double price=sc.nextDouble();

					list.add(new Product(id,name,price));
					break;
				case 2:
					Iterator i=list.iterator();
					while(i.hasNext())
					{
						System.out.println(i.next().toString());
					}
					break;
				case 3:	
					for(int i=0;i<Product.length;i++)
					{
						
					}
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Enter Valild choice");
			}
		}while(true);
	}
}