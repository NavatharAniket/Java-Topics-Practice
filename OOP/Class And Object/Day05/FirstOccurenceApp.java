/*
Q2. Find the First Occurrence of a Target in Sorted Array

Your Task : you have to create class name as FirstOccurence with following methods 
void setArray(int a[]): this function can accept integer array as parameter 
int findFirstOccurenceIndex(int key): you have to find the first occurence of key if key present in more than one time in array

Example: 
 Array          :  int[] arr = {1, 2, 4, 4, 4, 6, 7};
 Search key :   int skey = 4;
Output: Index is  2 
Note: here 4 occur three times in array so the first occurence of 4 on index 2
If search key not found in array return -1
Important point: you have to user binary search approach for solve above approach 

*/
import java.util.Scanner;
class FirstOccurence
{
	private int[] a;
	public void setArray(int a[])
	{
		this.a=a;
	}

	public int findFirstOccurenceIndex(int target)
	{
		int left = 0;
        	int right = nums.length - 1;
 
        	// initialize the result by -1
        	int result = -1;
 
        	// loop till the search space is exhausted
        	while (left <= right)
        	{
        	    // find the mid-value in the search space and compares it with the target
            	int mid = (left + right) / 2;
 
            	// if the target is located, update the result and
            	// search towards the left (lower indices)
            	if (target == nums[mid])
            	{
                	result = mid;
                	right = mid - 1;
            	}
 
           	 // if the target is less than the middle element, discard the right half
           	 else if (target < nums[mid]) {
           	     right = mid - 1;
           	 }
 
           	 // if the target is more than the middle element, discard the left half
           	 else {
           	     left = mid + 1;
           	 }
        	}
	}

		return result;
	
	
}

class FirstOccurenceApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Targeted Element ");
		int target=sc.nextInt();

		FirstOccurence fo=new FirstOccurence();
		int[] nums = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
		fo.setArray(a);
		System.out.println("first occurance is "+fo.findFirstOccurenceIndex(target));
			
	}
}