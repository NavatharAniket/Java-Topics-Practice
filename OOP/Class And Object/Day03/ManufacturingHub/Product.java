/*
Product class : it is POJO class with field id,name,rate,qty,count 
*/
class Product
{
	private int id;
	private String name;
	private float rate;
	private float qty;
	private int count;
		
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		retun id;
	}

	public void setName(String Name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	public void setRate(float rate)
	{
		this.rate=rate;
	}
	public float getRate()
	{
		return rate;
	}

	public void setQty(float qty)
	{
		this.qty=qty;
	}
	public float getQty()
	{
		return qty;
	}

	public void setCount(int count)
	{
		this.count=count;
	}
	public int getCount()
	{
		return count;
	}
}





