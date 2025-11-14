import java.util.Scanner;
class Table
{
	public synchronized void showTable(int no)
	{
		try
		{
			for(int i=1;i<11;i++)
			{
				System.out.println("Table of Number "+no+" "+no*i);
				if(i==5)
				{ 
					wait();
				}
				Thread.sleep(1000);

			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is"+ex);
		}
	} 


 	synchronized void recallMyThread()
  	 {
		    try{
				notifyAll();
			}
			catch(Exception ex)
			{
				 System.out.println("Error is "+ex);
			} 
  	 }

}

class Two extends Thread
{
	Table table;
	public Two(Table table)
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
	public Three(Table table)
	{
		this.table=table;
	}
	public void run()
	{
		table.showTable(3);
	}
}

class Q4
{
	public static void main(String[] args)
	{
		Table table=new Table();
		Two two=new Two(table);
		two.start();

		Three three=new Three(table);
		three.start();

		do{
		 	 Scanner xyz  = new Scanner(System.in);
		 	 String msg=xyz.nextLine();
		 	 if(msg.equals("restart"))
		 	 {
				table.recallMyThread();
		 	 }
		 	 if(msg.equals("stop"))
		  	{
				System.out.pritln("Program terminated");
				System.exit(0);
		  	}
		  }while(true); 

	}
}