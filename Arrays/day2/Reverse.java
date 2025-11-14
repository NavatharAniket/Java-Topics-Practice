/*
6).WAP to enter the five element in array and reverse it ? 
e.g. 
a[0]   a[1]   a[2]  a[3]   a[4] 
10 	20	30   40     50 
After Reverse Array should like as  
a[0]   a[1]   a[2]  a[3]   a[4] 
50      40     30    20     10 
*/

class Reverse
{
	public static void main(String[] args)
	{
		int[] arr={10,20,30,40,50};
		for(int i=0;i<arr.length/2;i++)
		{
			int flag=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-i-1]=flag;
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);	
	}
}