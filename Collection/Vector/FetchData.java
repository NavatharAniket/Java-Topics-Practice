import java.util.Scanner;
import java.util.Vector;
class FetchData
{
	public static void main(String[] args)
	{
		Vector v=new Vector(3,1);
		Scanner sc=new Scanner(System.in);
		v.add(100);
		v.add(200);
		v.add(300);
		
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
			
		}
		
		v.add(400);
		System.out.println(v.size());
		
	}
}