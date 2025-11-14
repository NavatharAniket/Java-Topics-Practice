import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.Collections;

class Q2
{
	public static void main(String[] args)
	{
		List<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(50);
		al.add(60);	
/*
		Set<Integer>hm=new HashSet<Integer>(al);	
		al=new ArrayList<Integer>(hm);
		System.out.println(al);
*/
		Collections.sort(al);
		System.out.print(" "+al.get(0));
		for(int i=1;i<al.size();i++)
		{
			if(al.get(i)!=al.get(i-1))
				System.out.print(" "+al.get(i));
		}
	}
}