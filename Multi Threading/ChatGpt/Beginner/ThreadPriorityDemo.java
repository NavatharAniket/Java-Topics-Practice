/*
Thread Priority Demo

Create 3 threads with different priorities and observe execution order.
*/

class First extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("First Priority");
				Thread.sleep(1000);

			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex);
		} 
	}
}

class Second extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Second Priority");
				Thread.sleep(1000);

			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex);
		} 		
	}
}

class Third extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Third Priority");
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex);
		} 		
	}
}

class ThreadPriorityDemo
{
	public static void main(String[] args)
	{
		Thread t=new First();
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		
		t=new Second();
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();

		t=new Third();
		t.setPriority(Thread.NORM_PRIORITY);
		t.start();
	}
}