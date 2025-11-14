import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
class Q3
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

		Map<Integer,Integer>hm=new HashMap<Integer,Integer>();
		for(int i:al)
		{
			Integer val=hm.get(i);
			if(val==null)
			{
				val=0;
			}
			val++;
			hm.put(i,val);
		}
		
		System.out.println(hm);

		Collections.sort(al);
		//int i=1;
		int count=1;
		for(int i=1;i<al.size();i++)
		{
			if(al.get(i)==al.get(i-1))
			{
				count++;
			}
			else
			{
				System.out.println(al.get(i-1)+" "+count);
				count=1;
							
			}
		}

		System.out.println(al.get(al.size()-1)+" "+count);
	}
	
}
