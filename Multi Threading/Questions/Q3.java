class Table 
{
	public synchronized void showTable(int no)
	{
		try
		{
			for(int i=1;i<11;i++)
			{
				System.out.println("Table of "+no+" is "+i*no);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception in Thread "+no+" is "+ex);
		}
	}
}

class Two extends Thread
{
	Table table;
	Two(Table table)
	{
		this.table=table;
	}

	public void run()
	{
		table.showTable(2);
	}
}

class Three extends Thread
{
	Table table;
	Three(Table table)
	{
		this.table=table;
	}
	
	public void run()
	{
		table.showTable(3);
	}
}

class Q3
{
	public static void main(String[] args)
	{
		Two t=new Two(new Table());
		t.start();

		Three th=new Three(new Table());
		th.start();
	}
}