
import java.util.Scanner;
class Months{
	public static void main(String[] args){
	
	//creating object of scanner class for taking input from user
	Scanner sc = new Scanner(System.in);

	System.out.println("enter no of days in mouth ");
	
	//taking input from user
	int days = sc.nextInt();
	
	switch(days){
	case 28:
		System.out.println("Feb");
		break;
	case 30:
		System.out.println("April\tJune\tSep\tNov");
		break;
	case 31:
		System.out.println("Jan\tMarch\tMay\tJuly\tAug\tOct\tDec");
		break;
	default:
		System.out.println("Enter valid Choice");
	
		}

	
	
	}
}