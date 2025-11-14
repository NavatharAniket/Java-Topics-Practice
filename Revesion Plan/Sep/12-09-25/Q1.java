import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Q1
{
	public static void main(String[] args)
	{
		List<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println("max element is "+Collections.max(al));
		System.out.println("max element is "+Collections.min(al));

		int m=Integer.MIN_VALUE;
		int s=Integer.MAX_VALUE;
		for(Integer i:al)
		{
			if(i>m)
			{
				m=i;
			}
	
			if(i<s)
			{
				s=i;
			}

		}
		System.out.println("max is "+m);
		System.out.println("min is "+s);
	}
}