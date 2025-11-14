/*
3)WAP to enter the five element and display in ascending order ? 
a[0]                         5 
a[1]                         3 
a[2]                         6 
a[3]                         4 
a[4] 			     1 
Output like as  
1 
3 
4 
5 
6

*/

class Assending
{
	public static void main(String[] args)
	{
		int[] arr ={5,3,6,4,1};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int flag=arr[i];
					arr[i]=arr[j];
					arr[j]=flag;
				}
			}
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}