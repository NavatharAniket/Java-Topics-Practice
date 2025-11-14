/*
Q1. Suppose consider we are working on billing Application and we have following types of classes 
Product with field id,name and price and it is POJO class 
Customer with field id, name address,email , contact and it is POJO class
Shop with following methods 
void storeProducts(Customer c,Product …p): this method can accept infinite product list
void calBill(): this method can calculate bill with grand total and your output should be 

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
		price = f;
	}
	public float getPrice()
	{
		return price;
	}
	
}

class Customer
{
	private int id;
	private String name;
	private String address;
	private String email;
	private long contact;
	
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
		name = s;
	}

	public String getName()
	{
		return name;
	}
	
	public void setAddress(String ad)
	{
		address=ad;
	}
	
	public String getAddress()
	{
		return address;
	}

	public void setEmail(String em)
	{
		email=em;
	}

	public String getEmail()
	{
		return email;
	}

	public void setContact(long l)
	{
		contact = l;
	}
	
	public long getContact()
	{
		return contact;
	}
}

class Shop
{
	Customer cp;
	Product[] p;
	void storeProducts(Customer cr,Product ...pr)
	{
		cp=cr;
		p=pr;
	}

	void calBill()
	{
		int sum=0;
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		System.out.println("CustId:"+cp.getId()+"\t Name:"+cp.getName()+"\t Address:"+cp.getAddress()+"\t Email:"+cp.getEmail()+"\t Contact:"+cp.getContact());
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		System.out.println("Prod Id"+"\t\t"+"prod Name"+"\t\t"+"prod Quality"+"\t\t"+"Prod Price"+"\t\t"+"total");
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].getId()+"\t\t"+p[i].getName()+"\t\t\t"+"10"+"\t\t\t"+p[i].getPrice()+"\t\t\t"+10*p[i].getPrice());
			sum += 10*p[i].getPrice();
		}
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		System.out.print("\t\t\t\t\t\t\t\t");
		System.out.println("Total bill without GST "+sum);
		System.out.print("\t\t\t\t\t\t\t\t");
		System.out.println("Total bill With 18% GST "+(sum+sum*18/100));

	}


}
public class ShopApp
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Details for product 1");
		/*
		System.out.println("Enter Product id");
		System.out.println("Enter Product Name");
		System.out.println("Enter Product Price");
		*/
		
		Product p=new Product();
			System.out.println("Enter Product id");
			int id=sc.nextInt();
			p.setId(id);
			System.out.println("Enter Product Name");
			String name=sc.nextLine();
			p.setName(name);
			System.out.println("Enter Product Price");
			float f=sc.nextFloat();
			p.setPrice(f);

		Product p1=new Product();
			System.out.println("Enter Product id");
			id=sc.nextInt();
			p1.setId(id);
			System.out.println("Enter Product Name");
			name=sc.nextLine();
			p1.setName(name);
			System.out.println("Enter Product Price");
			f=sc.nextFloat();
			p1.setPrice(f);

		Product p2=new Product();
			System.out.println("Enter Product id");
			id=sc.nextInt();
			p2.setId(id);
			System.out.println("Enter Product Name");
			name=sc.nextLine();
			p2.setName(name);
			System.out.println("Enter Product Price");
			f=sc.nextFloat();
			p2.setPrice(f);
		
		Customer c=new Customer();
			c.setId(1);
			c.setName("Aniket");
			c.setAddress("Karve Nagar,pune");	
			c.setEmail("aniketnavathar@gmail.com");
			c.setContact(96576051923l);
		Shop s=new Shop();
		s.storeProducts(c,p,p1,p2);
		s.calBill();
	}
}