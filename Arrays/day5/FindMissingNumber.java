/*
Find the Missing Number - Given an array containing n distinct numbers in the range 1 to n+1, find the missing number.
*/

imort java.util.Scanner;
class FindMissingNumber
{
	private int arr[];
	public void setArrays (int[] arr)
	{
		this.arr=arr;	
	}

	public void sortArray()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				
			}	
		}
	}
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arrays size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println(Enter Elements in Arrays );
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		} 

		
		FindMissingNumber fmn =new FindMissingNumber();
		fmn.find(arr);
	}
}