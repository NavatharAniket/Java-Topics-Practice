import java.util.Scanner;
class Multi
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		int[][] arr = new int[3][3];
		int[][] arr2=new int[3][3];

		for(int i = 0; i<arr.length;i++)
		{	
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
				//arr2[i][j]=sc.nextInt();
			}
		}

		System.out.println("NEter 2 arr");
		for(int i = 0; i<arr.length;i++)
		{	
			for(int j=0;j<arr[i].length;j++)
			{
				//arr[i][j]=sc.nextInt();
				arr2[i][j]=sc.nextInt();
			}
		}


		int[][] m=new int[3][3];
		int s=0;
		for(int i = 0;i<3;i++)
		{	
			for(int j=0;j<3;j++)
			{	
				s=0;
				for(int k =0;k<3;k++)
				{
					int sum=  arr[i][k]*arr2[k][j];
					//System.out.printf("\tsum is "+i+" "+ j+" "+k+" "+sum+" ");
					s=s+k;
				}
				System.out.println(" "+s);
			}
			System.out.println();
			
		}
	}
}