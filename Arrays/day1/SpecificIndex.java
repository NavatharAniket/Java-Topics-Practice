import java.util.Scanner;
class SpecificIndex 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		//arr[]={1,2,3,4,5};
		System.out.println("Enter 5 Elements in Array");
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a Index For Inserting Element ");
		int index= sc.nextInt();
		System.out.println("Enter a Element ");
		
		int temp=0,temp2=sc.nextInt();
		
		for( ; index<arr.length ;index++)
		{
			temp=arr[index];
			arr[index]=temp2;
			temp2=temp; 	
		}
			
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
	}
}