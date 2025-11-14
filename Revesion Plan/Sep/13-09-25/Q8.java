import java.util.*;
class Q8
{
	public static void main(String[] args)
	{
		int[] arr = {100, 4, 200, 1, 3, 2};
		Set<Integer>s=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			s.add(arr[i]);
		}

		int l=0;
		for(int i:s)
		{
			if(!s.contains(i-1))
			{
				int x=i;
				int count=1;
				while(s.contains(x+1))
				{
					count++;
					x++;
				}
				l=Math.max(l,count);
			}
			
		}
		
		System.out.println("max Length is "+l);
	}
}