/*

7) WAP to enter the 10 element array and print the occurrence of every element ? 
a[0]    a[1]          a[2]           a[3]          a[4]          a[5]           a[6]        a[7]          a[8]          a[9] 
10 	20	       30	      10            20             50             30          10            30            10 
Output : 
Element  count 
10  --------------------      4 
20  --------------------      2 
30  --------------------       3 
50  ------------------         1 
*/

class Frequency
{
	public static void main(String[] args)
	{
		int[] arr={10,20,30,10,20,50,30,10,30,10};                          incompleted statement
		int[] count= new count[51];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			k=arr[i];
			count[k]++;	
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+count[i]);	
		}
		
	}
}