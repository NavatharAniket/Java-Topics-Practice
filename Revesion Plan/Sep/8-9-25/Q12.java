class Q12
{
	public static void main(String[] args)
	{
		int[] arr={15, 22, 22, 35, 40, 40, 5};
		int largest=0;
		int secondLargest=0;
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				secondLargest=largest;
				largest=arr[i];
				
			}
			else if( arr[i]>secondLargest && arr[i]<largest)
			{
				secondLargest=arr[i];
				//System.out.print(arr[i]);
			}
		}

		System.out.println(secondLargest);
	}
}