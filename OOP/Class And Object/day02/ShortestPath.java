/*
Given a route containing 4 directions (E,W,N,S) find the shortest path to reach destination
	
			 N
			 |
			 |
		W--------|------------E
			 |
			 |
			 | 
			 S

	"WNEENESENNN"
*/


class ShortestPath
{
	public static void main(String[] args)
	{
		String distance = "WNEENESENNN";
		int x=0,y=0;
		if(int i=0;i<distance.length();i++)
		{
			if(distance.chatAt(i)="W")
				x--;
			else if(distance.chatAt(i)="E")
				x++;
			else id(distance.chatAt(i)="N")
				y++;
			else 
				y--;
		}

		int num=math.sqrt(x*x+y*y);
		System.out.println("Shortest Path is "+num);
	}

	
}