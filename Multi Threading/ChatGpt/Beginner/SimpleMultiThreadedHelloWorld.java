/*
Simple Multi-threaded Hello World

Create 3 threads that each print "Hello from Thread X" 5 times.
*/

class First extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello From Thread x");
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
				System.out.println("Hello From Thread y");
				Thread.sleep(1000);

			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex);
		}
	}
}

class Three extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello From Thread z");
				Thread.sleep(1000);

			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex);
		}
	}
}
class SimpleMultiThreadedHelloWorld
{
	public static void main(String[] args)
	{
		Thread t=new First();
		t.start();
		t=new Second();
		t.start();
		t=new Three();
		t.start();
	}
}