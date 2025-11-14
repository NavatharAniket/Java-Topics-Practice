class Q13
{
	public static void main(String[] args)
	{
		int[] arr={15, 22, 22, 35, 40, 40, 5};
		int s=Integer.MAX_VALUE;
		int sm=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(s>arr[i])
			{
				sm=s;
				s=arr[i];
				
			}
			else if( arr[i]<sm && arr[i]>s)
			{
				sm=arr[i];
				//System.out.print(arr[i]);
			}
		}

		System.out.println(sm);
	}
}