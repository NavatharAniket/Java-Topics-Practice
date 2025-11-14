class Q4
{
	public static void main(String[] args)
	{
		int[] arr={1, 2, 3, 4, 6};
		int start=0;
		int end=arr.length-1;
		boolean flag=false;
		int target=6;
		while(start<end)
		{
			if(arr[start]+arr[end]==target)
			{
				System.out.println(start+" "+end);
				flag=false;
				break;
			}
			else if(arr[start]+arr[end]>target)
			{
				end--;
			}
			else
			{
				start++;
			}
		}

		if(flag)
			System.out.println("Cannot contain that number");
	}
}