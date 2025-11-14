class Q23
{
	public static void main(String[] args)
	{
		int[] arr={4, 5, 6, 4, 7, 4, 8};
		int k=0;
		for(int i:arr)
		{
			if(i==4)
				k++;
		}
		System.out.println(k);
	}
}