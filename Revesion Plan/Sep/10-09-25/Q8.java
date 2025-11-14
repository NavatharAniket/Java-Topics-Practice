class Q8
{
	public static void main(String[] args)
	{
	        int[] arr = {1, 0, 0, 1, 1, 0, 1, 1, 1};
        	int k = 2;
		
		int left=0;
		int right=0;
		int totalZero=0;
		int maxLen=0;
		while(right<arr.length)
		{
			if(arr[right]==0)
			{
				totalZero++;
			}
			
			while(left<=right && totalZero > k)
			{
				if(arr[left]==0)
				{
					totalZero--;
				}
				left++;
			}

			maxLen=Math.max(maxLen,right-left+1);
			right++;
		}
		System.out.println("Max 1 are "+maxLen);
	}
}