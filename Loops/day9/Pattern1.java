class Pattern1
{
	public static void main(String[] args)
	{
		
		for(int i = 1; i<6; i++)
		{
			int k = 0;
			for(int j = 1; j <11; j++)
			{
				if(j==6)
					k=0;
				if(j<=i || j>=11-i)
				{
					System.out.print(k);
					
					if(k==0)
						k++;

					else
						k--;
	
				}

				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}