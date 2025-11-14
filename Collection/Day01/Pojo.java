class Product
{
	int id;
	String name;
	float price;

	public void setId(int id)
	{
		this.id=id;
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

	public void setPrice(float price)
	{
		this.price=price;
	}
	public float getPrice()
	{
		return price;
	}
}


class Company
{
	String name;
	int tanNum;
	Product[] p;	

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}


	public void setTanNum(int tanNum)
	{
		this.tanNum=tanNum;
	}
	public int getTanNum()
	{
		return tanNum;
	}

	public void setProduct(Product ...p)
	{
		this.p=p;
	}
	
	public Product[] getProduct()
	{
		return p[];
	}
}


class Store
{
	String name;
	Company[] c;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	public void setCompany(Company ...c)
	{
		this.c=c;
	}
	public Company[] getCompany()
	{
		return c[];
	}
}