/*
Q6. WAP to create POJO class name as Player with id, name and run and input the data from keyboard and display it.

*/

import java.util.Scanner;
class Player
{
	private int id;
	private String name;
	private int run;
	
	
	public void setid(int num)
	{
		this.id=num;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setrun(int run)
	{
		this.run=run;
	}
	public void show()
	{
		System.out.println("run "+id+" name "+name+" run "+run);
	}
}

class PlayerApp
{
	public static void main(String[] args)	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id number");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name number");
		String name=sc.nextLine();
		
		System.out.println("Enter run number");
		int run=sc.nextInt();

		Player p=new Player();
		p.setid(id);
		p.setName(name);
		p.setrun(run);
		p.show();


		
	}
}