import java.util.Scanner;
class Dublicate
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

		int num=0;
		for(int i = 1; i<arr.length-1;i++)
		{	

			for(int j=i+1;j<arr.length;j++)
			{	
				//int[] arr2 = {0,0,0};
				
				for(int k=0;k<arr[i].length;k++)
				{
					//if(i==j && j==k)
						//continue;
					if(arr[num][j] == arr[i][k])
					 {
						System.out.printf(" "+arr[i][j]+" "+arr[num][k]+"\t");
					 }
				}
					
				
				//System.out.println();
			}
			System.out.println();
			if(num<2)
					num++;
		}
		
	}
}