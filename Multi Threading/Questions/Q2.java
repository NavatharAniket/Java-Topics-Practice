class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				
				System.out.println("Thread A is "+i+" "+isAlive());
				if(i==3)
				{
					stop();
				}
				sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception in A is "+ex);
		}
	}
}


class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread b is "+i);
				sleep(10000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception in B is "+ex);
		}
	}
}

class Q2
{
	public static void main(String[] args)
	{
		A a=new A();
		a.start();

		B b=new B();
		b.start();
	}
}