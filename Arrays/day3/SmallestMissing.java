/*
SmallestMissing number in java
*/

class SmallestMissing
{
	public static void main(String[] args)
	{
		int[] arr={0,1,2,3,4,5,6,7,9};
		
		for(int i=0;i<10;i++)
		{
			if(arr[i]!=i)
			{
  				System.out.print(" "+i);
				break;
			}
		}		
	}
}