class Q5
{
	public static void main(String[] args)
	{
		int[] arr={10,20,30,40,50};
		int target=30;
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			if(target==arr[i])
			{
				System.out.println("Target found at index "+i);
				flag=false;
				break;
			}
		}	

		if(flag)
		{
			System.out.println("Not found");
		}
	}
}