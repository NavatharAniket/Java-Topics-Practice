import java.util.*;
class Q10
{
	public static void main(String[] args)
	{
		Set<Integer>s=new HashSet<Integer>();

		int[] nums1 = {1, 2, 2, 1};
        	int[] nums2 = {2, 2};
		
		for(int i:nums1)
		{
			s.add(i);
		}

		Set<Integer>result=new HashSet<>();
		for(int i:nums2)
		{
			if(s.contains(i))
			{
				result.add(i);
			}
		}
		System.out.println(result);
	}
	
}