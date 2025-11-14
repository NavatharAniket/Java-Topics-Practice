/*
Q1. WAP to create character array of size 5 and convert lower case character array to uppercase character array
*/

class LoweCaseToUpperCase
{
	public static void main(String[] args)
	{
		char[] arr={'a','s','d','g','h'};
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] -=32;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}