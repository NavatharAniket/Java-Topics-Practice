// find odd, neon, perfect, Armstrong, Happy Number, even form 1 to 100;

class Find{
	public static void main(String[] args)
	{
	//Scanner sc = new Scanner(System.in);
	//int num = sc.nextInt();
	
	//perfect number
/*
	int i = 1;

	while(i<100)
	{
		int j = 1,sum = 0;
		while(j < i)
		{	
			if(i % j == 0)
			{
				sum = sum + j;
				
			}
			j++;
			
		}
	if(sum == i)
	System.out.println(sum);
	i++;	
	}
*/

/*	//Neon Number
	int i = 1;
	while(i<100)
	{
		int sqr = i*i,sum = 0;
		
		while(sqr > 0)
		{
		int fact = sqr % 10;
		sqr = sqr / 10;
		sum = sum + fact;
		} 
	if(sum == i)
	System.out.println(i);	
	
	i++;	
	}
*/
/*
	// ArmStrong Number
	int num = 1;
	while(num < 100)
	{
		int temp = num ,count = 0,fact,sum = 0;

		while(temp > 0)
		{
			count ++;
			temp = temp / 10;
		}
		
		temp = num;
	
		while(temp > 0)
		{
			fact = temp % 10;
			int i = 1,sqr = 1;
			while(i<=count)
			{
			 	sqr = fact * sqr;
				i++;
			}
			sum = sum + sqr;
			temp = temp / 10;
		}
		if (sum == num)
			System.out.println(num);
		num++;
	}
*/

	
			
}
}









