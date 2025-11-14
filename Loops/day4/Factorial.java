4. Write a program to find the factorial of a given number

import java.util.Scanner;
class Fact{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to Find Factorial of Given Number");
		int num = sc.nextInt();
		
		int i = 1,fact =1 ;
		while(i<=num){
			
			fact = fact * i;
			i++;
			}
		System.out.println("Factorial is " + fact);
		
	}
}