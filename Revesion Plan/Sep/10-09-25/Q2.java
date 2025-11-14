class Q2
{
	public static void main(String[] args)
	{
		int[] arr={2, 1, 5, 1, 3, 2};
		int k=3;
		
		int start=0;
		int end=k-1;
		int sum=0;
		int minSum=Integer.MAX_VALUE;
		for(int i=0;i<k;i++)
		{
			sum+=arr[i];
		}

		while(end<arr.length-1)
		{
			sum -=arr[start];
			start++;
			end++;
			sum+=arr[end];
			
			if(sum<minSum)
			{
				minSum=sum;
			}
		}
		System.out.println("Minimum Sum is "+minSum);
	}
}