class Q11
{
	public static void main(String[] args)
	{
		int[] arr={1, 2, 3};
		int[] arr1={2, 3, 4};

		int start=0;
		int left=0;
		while(start<arr.length && left<arr1.length)
		{
			if(arr[start]==arr1[left])
			{
				System.out.print(arr[start]+" ");
				start++;
				left++;
			}
			else if(arr[start]<arr1[left])
			{
				System.out.print(arr[start]+" ");
				start++;
			}
			else
			{
				System.out.print(arr[left]+" ");
				left++;
			}
			
		}

		while(left<arr1.length)
		{
			System.out.print(arr1[left]+" ");
			left++;
		}
	}
}