/* . Write a program to find the sum of numbers from 1 to 10 using while loop */

import java.util.Scanner;
class Sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int i = 1,sum = 0;

		while(i<=num){
			sum = sum + i;
			i++;	
		}
	        System.out.println("Sum of N numbers is "+sum);
	}
}