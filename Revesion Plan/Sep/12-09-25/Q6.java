import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

class Q6
{
	public static void main(String[] args)
	{
		List<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(60);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(10);
		al.add(10);
		al.add(50);
		al.add(50);

		Set<Integer>hs=new HashSet<Integer>(al);
		int target=70;

		for(int i:al)
		{
			int sum=target-i;

			if(hs.contains(sum))
			{
				System.out.println(i+" "+sum);
				hs.remove(i);
				hs.remove(sum);
			}
		}
	}
}