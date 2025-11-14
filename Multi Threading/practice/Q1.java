import java.util.*;
class Product
{
	private int id;
	private String name;
	private String spareOne;
	private String spareTwo;

	public void setId(int id)
	{ this.id=id;
	}
	public int getId()
	{
		return id;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	public void setSpareOne(String spareOne)
	{
		this.spareOne=spareOne;
	}
	public String getSpareOne()
	{
		return spareOne;
	}

	public void setSpareTwo(String spareTwo)
	{
		this.spareTwo=spareTwo;
	}
	public String getSpareTwo()
	{
		return spareTwo;
	}

}

class Machine1 extends Thread
{
	Product p[];
	
	void setProduct(Product[] p)
	{
		this.p=p;
	}

	public void run()
	{
		try
		{
			for(int i=0;i<p.length;i++)
			{
				p[i].setSpareOne("Set By Machine1");
				System.out.println("Product use by machine1");
				sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception in Machine 1 is "+ex);
		}
	}
}

class Machine2 extends Thread
{
	Product[] p;
	void setProduct(Product[] p)
	{
		this.p=p;
	}

	public void run()
	{
		try
		{	
			for(int i=0;i<p.length;i++)
			{
				p[i].setSpareTwo("Set By Machine2");
				System.out.println("Product use by machine2");
				sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception in Machine2 is "+ex);
		}
	}
}

class Q1
{
	public static void main(String[] args) throws Exception
	{
		Product[] p=new Product[5];

		Scanner sc=new Scanner(System.in);
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter Product name and id");
			String name=sc.nextLine();
			int id=sc.nextInt();
			
			p[i]=new Product();
			p[i].setId(id);
			p[i].setName(name);
		}
		
		Machine1 m1 = new Machine1();
		m1.setProduct(p);
		m1.start();

		Machine2 m2 = new Machine2();
		m2.setProduct(p);
		m2.start();

		Thread.sleep(110000);
		System.out.println("Display product details with spare update by machine");
		for(int i=0; i<p.length; i++)
		{
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getSpareOne()+"\t"+p[i].getSpareTwo());
		}


	}
}