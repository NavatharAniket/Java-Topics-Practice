/*
Print Numbers Using Two Threads
One thread prints even numbers, and the other prints odd numbers from 1 to 20.
*/

class Even extends Thread
{
	public void run()
	{
		try{
			for(int i=0;i<21;i++)
			{
				if(i%2==0)
				{
					System.out.println("Even Number is "+i);
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex);
		}
	}
}

class Odd extends Thread
{
	public void run()
	{
		try{
			for(int i=0;i<21;i++)
			{
				if(i%2!=0)
				{
					System.out.println("Odd number is "+i);
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex);
		}
	}
}
class PrintNumbersUsingTwoThreads
{
	public static void main(String[] args)
	{
		Thread t=new Even();
		t.start();
		t=new Odd();
		t.start();	
	}
}