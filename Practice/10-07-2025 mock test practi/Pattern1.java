class Pattern1
{
	public static void main(String[] args)
	{
		for(int i=0;i<7;i++)
		{	
			char ch='A';
			for(int j=0;j<14;j++)
			{
				if(j>=i && j<14-i)
				{
					if((i%2==0 && j%2!=0) || (i%2!=0 && j%2==0))
					{
						System.out.print(ch+" ");
						ch++;
					}
					else
					{
						System.out.print("  ");		
					}
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}