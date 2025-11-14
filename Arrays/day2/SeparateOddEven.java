/*
9) . Write a program in C to separate odd and even integers in separate arrays ? 
Test Data : 
Input the number of elements to be stored in the array :5 
Input 5 elements in the array : 
element - 0 : 25 
element - 1 : 47 
element - 2 : 42 
element - 3 : 56 
element - 4 : 32 
Expected Output : 
The Even elements are : 
42 56 32 
The Odd elements are : 
25 47

*/

class SeparateOddEven
{
	
	public static void main(String[] args)
	{
		int[] arr={25,47,42,56,32};
		int[] odd=new int[5];
		int[] even=new int[5];
		int o=0,e=0;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]%2)==0)
			{
				even[e]=arr[i];
				e++;
			}
			else
			{
				odd[o]=arr[i];
				o++;
			}
		}

		System.out.print("Even Numbers ");
		for(int i=0;i<even.length;i++)
			System.out.print(" "+even[i]);

		System.out.println();
		System.out.print("Odd Numbers ");
		for(int i=0;i<odd.length;i++)
			System.out.print(" "+odd[i]);
		
	}
}