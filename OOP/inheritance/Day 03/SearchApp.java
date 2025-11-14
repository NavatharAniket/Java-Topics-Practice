import java.util.Scanner;
abstract class Search
{
	int[] arr;
	public void setArray(int[] arr)
	{
		this.arr=arr;
	}
	public abstract int s(int key);
}

class Linear extends Search
{
	public int s(int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}	
		}

		return -1;
	}
}

class Binary extends Search
{
	public int s(int key)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(arr[mid]<key)
			{
				start =mid+1;
			}
			else
			{
				end=mid-1;
			}
				
		}

		return -1;
	}
}


class SearchApp
{
	public static void main(String[] args)
	{
	int[] arr = {1,2,3,4,5,6,7,8,9,10};

        Search se = new Linear();
        se.setArray(arr);
        System.out.println("Given array's index using Linear Search: " + se.s(5));

        se = new Binary();
        se.setArray(arr);
        System.out.println("Given array's index using Binary Search: " + se.s(5));
    }
}