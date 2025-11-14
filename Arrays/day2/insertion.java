/*
4) WAP to insert the element on specified position in array  ? 
e.g. declare the array of size 6 and store 5 values in it  and last block should be empty 
a[0]                        10 
a[1]                        20 
a[2]                        30
a[3]                        40 
a[4]                        50  
a[5] 
Enter the index on which value want to be insert  
e.g.    index    = 2  
Enter the value which want to store on index  
Value =  100 
When we insert the value on index then we need to shift the values from index to next index 
e.g. 
a[0]      	10                  
a[1]            20        
a[2]            100          
a[3]            30     
a[4]  		40
a[5]		50
10 20 100 30 40 50 
*/
import java.util.Scanner;
class insertion
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a index");
		int k=sc.nextInt();
		System.out.println("Enter a Value");
		int num=sc.nextInt();
		int num1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i>=k)
			{	
				num1= arr[i];
				arr[i]=num;
				num=num1;	
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}