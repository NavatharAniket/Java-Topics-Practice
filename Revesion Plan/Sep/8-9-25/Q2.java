class Q2
{
	public static void main(String[] args)
	{
		int[] arr={12,45,2,67,33,89,21};
		
		int min=Integer.MAX_VALUE;;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}