class Q8
{
	public static void main(String[] args)
	{
		int[] arr={5, 10, 15, 20, 25};
		int[] copy=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			copy[i]=arr[i]; 
		}
		for(int i=0;i<copy.length;i++)
		{
			System.out.print(copy[i]+" ");
		}

	}
}