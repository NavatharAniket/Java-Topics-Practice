
import java.util.Scanner;
class LinearSearch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for find");
		int key = sc.nextInt();
		int[] arr={10,20,30,40,50,60,70,80,90,100};
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			System.out.println(arr[i] + " present in "+i);	
		}
	}
}