/*
19) Write a program in C to find two elements whose sum is closest to zero 
Expected Output : 
The given array is : 38 44 63 -51 -35 19 84 -69 4 -46 
The Pair of elements whose sum is minimum are: 
[44, -46]
*/

class ElementSumClossToZero
{
	public static void main(String[] args)
	{
		int[] arr = {38, 44, 63, -51, -35, 19, 84, -69, 4, -46};
		int minSum=0;
		int k=0,l=0;
			
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				int sum = arr[i]+arr[j];
				
				if(minSum > sum)
				{
					
				}
			}	
		} 

		System.out.println("Elements "+k+" + "+l+" Sum is near to Zero is "+minSum);
	}
}