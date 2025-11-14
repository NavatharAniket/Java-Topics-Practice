/*
Create a Countdown Timer Using Threads

A thread prints a countdown from 10 to 0 with a 1-second delay between numbers.
*/

class Countdown extends Thread
{
	public void run()
	{
		try
		{
			for(int i=10;i>-1;i--)
			{
				System.out.print(i+" ");
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex);
		}
	}
}
class CreateCountdownTimerUsingThreads
{
	public static void main(String[] args)
	{
		Thread t=new Countdown();
		t.start();
	}
}