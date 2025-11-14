class Q13
{
	public static void main(String[] args)
	{
		int[] arr={1,8,6,2,5,4,8,3,7};
		
		int start=0;
		int end=arr.length-1;

		int maxWater=0;
		
		while(start<end)
		{
			int width=end-start;
			int height=Math.min(arr[start],arr[end]);

			int water=width*height;
			maxWater=Math.max(water,maxWater);
			
			if(arr[start]<arr[end])
			{
				start++;
			}
			else
			{
				end--;
			}
		}

		System.out.println(maxWater);
	}
}