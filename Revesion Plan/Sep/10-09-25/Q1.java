class Q1
{
	public static void main(String[] args)
	{
		int[] arr={2, 1, 5, 1, 3, 2};
		int k=3;
			
		int sum=0;
		int maxSum=0;
		for(int i=0;i<k;i++)
		{
			sum+=arr[i];
		}
		
		int start=0;
		int end=k-1;
		while(end<arr.length-1)
		{
			sum -=arr[start];
			start++;
			end++;
			sum+=arr[end];
			
			if(sum>maxSum)
			{
				maxSum=sum;
			}
		}
		System.out.println("MaxSum is "+maxSum);
	}
}