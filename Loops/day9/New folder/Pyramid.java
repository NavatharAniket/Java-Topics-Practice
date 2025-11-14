class Pyramid
{
	public static void main(String[] args)
	{
		
		for(int i =1; i<6;i++)
		{	
			for(int j =1; j < 11 ; j++)
			{
				if(j < 5 + i && j > 5-i )
					if((i%2==0 && j%2==1)||(i%2==1 && j%2==0))
						System.out.print(" ");
					else
						System.out.print("*");
				else
					System.out.print(" ");
			}
				System.out.println();
		}
	}
}