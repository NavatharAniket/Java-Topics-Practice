class MaxConsecutiveOne
{
	public int ConsecutiveOne(int[] arr)
	{
		int count=0;
		int MaxCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				count++;
			}
			else	
			{
				if(count>maxCount)
				{
					maxCount=count;
					count=0;
				}
				else 
				{
					count=0;
				}
			}
		}
		if(count>maxCount)
		{
			return count;
		}
		else
		{
			return maxCount;
		}
	}
	public static void main(String[] args)
	{
		int arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}
		System.out.println("Max Consucative one's is "+ConsecutiveOne(arr));
	}
}