class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread 1 is "+i);
			}
		}
		catch(Exception ex)
		{
			System.out.println("exception is "+ex);
		}
	}
}

class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=10;i<15;i++)
			{
				System.out.println("Thread 2 is "+i);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex);
		} 
	}
}
class Q1
{
	public static void main(String[] args)
	{
		A a=new A();
		a.start();

		B b=new B();
		b.start();
	}
}