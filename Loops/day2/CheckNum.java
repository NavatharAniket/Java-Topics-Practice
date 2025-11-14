import java.util.Scanner;
class{
	public static void main(String[] args){
	
	//creating scanner object for getting input from user
	Scanner sc = new Scanner(System.in);

	

	//geting choice from user 
	System.out.println("1 for positive negative zero \n"+"2 for even or odd \n"+"3 for max number using 2 number");
	int ch = sc.nextInt();

	System.out.println("Enter a Number");
	//getting input from user
	int n = sc.nextInt();

	switch(ch){
		case 1:
			if(n>0)
				System.out.println("number is positive);
			else if(n<0)
				System.out.println("number is negative);
			else 
				System.out.println("number is zero"); 
			break;

		case 2:
		}
	}
}