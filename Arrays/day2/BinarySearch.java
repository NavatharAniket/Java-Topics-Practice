import java.util.Scanner;
class BinarySearch
{

	public static int search(int arr[],int key)
	{
		int first=0,last=arr.length-1,mid=0;
		while(first <= last)
		{
			//System.out.println(" "+arr[i]+" "+key);
			mid=(first+last)/2;
			if(arr[mid]==key)
			{
				return mid;	
			}
			if(arr[mid]<key)
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
			
			
		}
		return -1;
	}
	public static void main(String[] args)
	{
	
		int[] arr={10,20,30,40,50,60,70,80,90,100};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key for Search in  Array");
		int key=sc.nextInt();	
		System.out.println("index of key is "+search(arr,key));	
	}
}