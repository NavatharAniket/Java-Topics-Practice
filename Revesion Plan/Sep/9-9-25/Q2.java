class Q2
{
	public static void main(String[] args)
	{
		int[] arr={1, 1, 2, 3, 3};
		int j=0;
		for(int i=1;i<arr.length;i++)
		{
			
			
				if(arr[i]==arr[j])
				{
					arr[i]=0;
				}
				else
				{
					j=i;
				}
			
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}