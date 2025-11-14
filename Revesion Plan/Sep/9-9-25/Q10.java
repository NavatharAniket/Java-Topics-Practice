class Q10
{
	public static void main(String[] args)
	{
		int[] arr={1, 2, 4};
		int[] arr1={2, 4, 6};

		int start=0;
		int left=0;
		while(start<arr.length && left<arr1.length)
		{
			if(arr[start]==arr1[left])
			{
				System.out.println(arr[start]+" ");
				start++;
			}
			else if(arr[start]<arr1[left])
			{
				start++;	
			}
			else
			{
				left++;
			}
			
		}
	}
}