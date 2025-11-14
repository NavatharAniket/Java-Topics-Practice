class Q9
{
	public static int number(int[] arr,int target)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				continue;
			}
			count++;
		}
		return count;
	}
	public static void main(String[] args)
	{
		int[] arr={3, 2, 2, 3};
		System.out.println(number(arr,3)); 
	}
}