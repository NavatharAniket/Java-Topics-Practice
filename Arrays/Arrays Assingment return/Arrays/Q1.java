/*
Find the Missing Number - Given an array containing n distinct numbers in the range 1 to n+1, find the missing number.



*/

import java.util.Scanner;
class Q1
{

//brute force method  
	public static void missingNumber(int[] arr)
	{
		for(int i=1;true;i++)          // used for find number
		{
			boolean flag=true;
			for(int j=0;j<arr.length;j++)  //loop for arrays 
			{
				if(i==arr[j])   // searching number in Arrays 
				{
					flag=false;
					break;
				}
				
			}
			if(flag)
			{
				System.out.println("Missing number is "+i);
				break;
			}
		}
	}

// binary search
	
	public static int findBs(int[] arr)    // wrong solution
	{
		int left = 0;
        	int right = arr.length - 1;
       	 
       		while (left <= right) 
		{
                	int mid = left + (right - left) / 2;
            
           		// If the middle element is in the correct position, the missing number is to the right
          		if (arr[mid] == mid + arr[0])
			{
                		left = mid + 1;
            		}
			else 
			{
                		// Otherwise, the missing number is to the left
                		right = mid - 1;
            		}
        	}
        
       		// The missing number is arr[0] + left
        	return (arr[0] + left);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr={1,10,9,4,7,6,5,8,2};
		//missingNumber(arr);

		System.out.println("Missing Value is "+findBs(arr));
	}
}