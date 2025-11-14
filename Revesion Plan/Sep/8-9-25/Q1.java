class Q1
{
	public static void main(String[] args)
	{
		int[] arr={12,45,2,67,33,89,21};
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}