/*
Strong number is a number which is 145 = 1fact + 4fact+ 5fact = 145
*/
import java.util.Scanner;
class Strong{
	public static void main(String[] args){
		//create Scanner class object
		Scanner sc= new Scanner(System.in); 

		//take number from user
		System.out.println("Enter a number");
		int num = sc.nextInt();
	
		//checking condition where num is always greater than the 0
		
		int rem = 0,sum = 0,temp = num;
		while(num>0){
			
			rem = num % 10;
			num = num / 10;
			int i = 1,fact = 1;
			while(i<=rem){
			
				fact = fact * i;
				i++;
				}
			sum = sum + fact;
			
			}

		if (sum == temp)
			System.out.println("No is StrongNo");
		else
			System.out.println("No is Not a StrongNo");
	}
}