/*11. Write a C program to find first and last digit of a number. */

import java.util.Scanner;
class FandL{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int temp = num,count=0;
			int d1 = num %10;
			System.out.println("last digit is" + d1);

		while(temp > 0)
			{
			
			temp = temp/10;
			if(temp == 0)
				{
				int d2 = num / count;
				System.out.println("first digit is"+d2);
				}
			}
			
	}
}





/*
import java.util.Scanner;
class {
	public static void main(String[] args){
		Scanner sc = new Scanner;
		int num = sc.nextInt();
		
		
	}
}
*/