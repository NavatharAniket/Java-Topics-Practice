class Q3
{
	public static void main(String[] args)
	{
		int[] arr={1, 3, 2, 6, -1, 4, 1, 8, 2};
		double[] avg=new double[5];

		int k=5;
		int sum=0;	
		int start=0;
		int end=k-1;

		for(int i=0;i<k;i++)
		{
			sum+=arr[i];
		}

		int i=1;
		avg[0]=(double)sum/k;
		while(end<arr.length-1)
		{
			sum-=arr[start];
			start++;
			end++;
			sum+=arr[end];

			avg[i]=(double)sum/k;
			i++;
		}

		for(i=0;i<avg.length;i++)
		{
			System.out.print(" "+avg[i]);
		}
	}
}