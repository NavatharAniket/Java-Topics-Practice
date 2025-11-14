/*
Q4. Search for a pair with a given sum in an array.
Given an array arr[] of n integers and a target value, the task is to 
find whether there is a pair of elements in the array whose sum is equal to
 target. This problem is a variation of 2Sum problem.
Examples: 
Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.
Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: There is no pair with sum equals to given target.

*/

import java.util.Scanner;

class Find
{
	public void findSum(int[] arr,int key)
	{
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==key)
					{
						flag=true;
						System.out.println("Given Sum is find by "+arr[i]+" "+arr[j] );
						break;
					}
			}
			if(flag)
				break;
		}
	}
}
class TwoSum
{
	
	public static void main(String[] args)
	{
		Find f=new Find();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements in Arrays ");	
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter sum for find ");
		int key=sc.nextInt();
		f.findSum(arr,key);
	}

}