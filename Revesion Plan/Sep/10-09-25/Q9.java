class Q9
{
	public static void main(String[] args)
	{
		int[] arr={0, 1, 1, 0, 1, 0, 0, 1};
		int k=2;

		int start=0;
		int end=0;

		while(end<arr.length)
		{
			if(arr[end]==0)
			{
				count++;
			}
			else
			{
				if(count>2)
				{
					start++;
				}
				
			}

		}
	}
}