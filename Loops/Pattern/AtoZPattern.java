class AtoZPattern
{
	public static void main(String[] args)
	{
		int k=1;
		for(int i=0;i<9;i++)
		{
		
			for(int j=0;j<5;j++)
			{
				
				if(j<=k)
				{
					System.out.print(" ");
					if(i<5)
					{
						k++;
					}
					else
					{
						k--;
					}
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}