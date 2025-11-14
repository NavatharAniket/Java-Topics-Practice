import java.util.Scanner;
class Calci{
	public static void main(String[] args){
	
	//creating Scanner class object 
	Scanner sc= new Scanner(System.in);
	
	//taking input from user for performing operatins
	System.out.println("Enter a numbers");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	//taking operator from user for geting understant which operation perform 
	System.out.println("Enter a operator "+ "+\t-\t*\t/");
	char ch = sc.next().charAt(0);
	
	//used default statement
	switch(ch){
		
		case '+':
			System.out.println("addition is "+ (num1+num2));
			break;
		case '-':
			System.out.println("Subtraction is "+( num1 - num2));
			break;
		case '*':
			System.out.println("Multiplication is "+(num1*num2));
			break;
		case '/':
			System.out.println("Division is "+(num1/num2));
			break;
		default:
			System.out.println("Enter valid Symbol");
		}
	} 
}