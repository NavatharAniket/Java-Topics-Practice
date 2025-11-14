/*
Q1. WAP to create POJO class name as Product with field id,name and price and create 5 product objects using array of objects and search product using its id 
Means you have to input id from keyboard and search product present in array of object or not using its id.

*/

import java.util.Scanner;
class Product
{
	private int id;
	private String name;
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

	public void setPrice(float f)
	{
		price=f;
	}
	public float getPrice()
	{
		return price;
	}
	
}

class Search
{
	Product[] pr;
	public void setObject(Product ...p)
	{
		pr=p;
	}

	public Product getProduct(int id)
	{
		for(int i=0;i<pr.length;i++)
		{	
			Product p= pr[i];
			if(p.getId()==id)
			{
				return p;
			}
		}
		return null;
	}
}

public class ProductPriceApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Product p=new Product();
		p.setId(1);
		p.setName("Soap");
		p.setPrice(2000f);

		Product p2=new Product();
		p2.setId(2);
		p2.setName("Mobile");
		p2.setPrice(30000f);

		Product p3=new Product();
		p3.setId(3);
		p3.setName("Laptop");
		p3.setPrice(40000f);
		
		Product p4=new Product();
		p3.setId(4);
		p3.setName("Mause");
		p3.setPrice(1000f);

		Search s=new Search();
		s.setObject(p,p2,p3);
				
		System.out.println("Enter id for Search Product");
		int id=sc.nextInt();
		Product p6=s.getProduct(id);
		
		if(p6==null)
		{
			System.out.println("Invalid id ");
		}
		else
		{
			System.out.println("Your Product Name is "+p6.getName());
		}
	}
	

}