class Butterfly
{
	public static void main(String[] args)
	{
		int k =8;
		for(int i =1; i<=10; i++)
		{
			for(int j =1; j<=11;j++)
			{
				if(i<=5)
				{
					if(j<=i || j>11-i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				else
				{
					if(j>i || j<11-i+1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}

			System.out.println();
			
		}
		
	}
}

