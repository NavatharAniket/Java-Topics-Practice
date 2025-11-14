class Q17
{
	public static void main(String[] args)
	{
		int arr[]={10, 21, 32, 43, 54, 65, 76};
		
		int m=0;
		int j=0;
		for(int i:arr)
		{
			if(i%2==0)
			{
				m++;
			}
			else
			{
				j++;
			}
		}
			
		System.out.println("Even "+m+" odd "+j);
		
	}
}