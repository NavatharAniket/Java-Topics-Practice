/*
Q3. WAP to create POJO class name as Player with field id,name and run and find player detail whose run is second highest 
*/


class Player
{
	private int id;
	private String name;
	private float run;

	public void setId(int i)
	{
		id=i;
	}
	public int getId()
	{
		return id;
	}	

	public void setName(String s)
	{
		name=s;
	}
	public String getName()
	{
		return name;
	}

	public void setRun(float f)
	{
		run=f;
	}
	public float getRun()
	{
		return run;
	}
}


class Second
{
	Player[] p;
	public void setPlayer(Player ...pl)
	{
		p=pl;
	}

	public void sort()
	{
		for(int i=0;i<p.length;i++)
		{
			for(int j=0;j<p.length-1;j++)
			{
				Player p1=p[j];
				Player p2=p[j+1];
				if(p1.getRun()<p2.getRun())
				{
					Player temp=p[j];
					p[j]=p[j+1];
					p[j+1]=temp;
				}	
			}
		}
	}

	public void display()
	{
		
		for(int i=0;i<p.length;i++)
		{
			System.out.print(" "+p[i].getRun());
			
		}
		System.out.println();
		System.out.println("Second Highest Score is "+p[1].getRun());
		
	}
}
public class PlayerDetailApp
{
	public static void main(String[] args)
	{
		Player p=new Player();
			p.setId(1);
			p.setName("Aniket");
			p.setRun(30f);
		Player p1=new Player();
			p1.setId(2);
			p1.setName("Om");
			p1.setRun(50f);
		Player p2=new Player();
			p2.setId(3);
			p2.setName("Shubham");
			p2.setRun(20f);
		Player p3=new Player();
			p3.setId(4);
			p3.setName("Rudra");
			p3.setRun(90f);	
		Player p4=new Player();
			p4.setId(5);
			p4.setName("Sunil");
			p4.setRun(24f);
		Player p5=new Player();
			p5.setId(6);
			p5.setName("Sahil");
			p5.setRun(26f);
		Player p6=new Player();
			p6.setId(7);
			p6.setName("Shivam");
			p6.setRun(57f);

		Second s=new Second();
		s.setPlayer(p,p1,p2,p3,p4,p5,p6);
		s.sort();
		s.display();
	}
}