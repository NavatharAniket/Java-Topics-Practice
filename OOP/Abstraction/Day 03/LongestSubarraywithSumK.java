class LongestSubarraywithSumK
{
	public static int LongestSubarray(int[] arr)
	{
		int maxCount=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0,sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum +=arr[j];
				if(sum==target)
				{
					count=j-i+1;
				}
				maxCount=Math.max(maxCount,count);
			}
		}

		return maxCount;
	}
	public static void main(String[] args)
	{
		int[] arr={10, 5, 2, 7, 1, -10};
		System.out.println("longest subArrays is "+LongestSubarray(arr));
	}
}