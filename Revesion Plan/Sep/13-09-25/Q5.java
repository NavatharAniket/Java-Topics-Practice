import java.util.*;

class Q5
{
	public static void main(String[] args)
	{
		int[] arr = {10, 15, -5, 15, -10, 5};

	        int target = 5;
		
		Map<Integer,Integer>hm=new HashMap<>();
		hm.put(0, -1);
		int sum = 0;
		//int count=0;
		//int maxCount=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
			//hm.put(sum, i);
			int sub=sum-target;
			if(hm.containsKey(sub))
			{
				//count=i-hm.get(sub)+1;
				//maxCount=Math.max(count,maxCount);
				System.out.println("SubArray found at "+(hm.get(sub)+1)+" "+i);
			}

			hm.putIfAbsent(sum, i);
		}

		//System.out.println(" ");
		
	}
}
