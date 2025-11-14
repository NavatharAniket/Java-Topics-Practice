class Q6
{
	public static void main(String[] args)
	{
		int[] arr={0, 1, 0, 3, 12};
		
		int end=arr.length;
		for(int i=0;i<end;i++)
		{
			if(arr[i]==0)
			{
				end--;
				arr[i]=arr[end];
				arr[end]=0;
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		
	}
}