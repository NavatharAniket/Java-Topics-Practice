/*

10). Write a program in C to delete an element at desired position from an array.  
Test Data : 
Input the size of array : 5 
Input 5 elements in the array in ascending order: 
element - 0 : 1 
element - 1 : 2 
element - 2 : 3 
element - 3 : 4 
element - 4 : 5 
Input the position where to delete: 3 
Expected Output : 
The new list is : 1 2 4 5

*/
import java.util.Scanner;
class Delete
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter position for Delete Element");
		int index=sc.nextInt();

		for(int i=0;i<arr.length;i++)
		{
			if(index-1 == i)
			{
				arr[i]=0;		
			}
		}

		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
	}
}