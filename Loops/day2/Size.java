import java.util.Scanner;
class Size{
	public static void main(String[] args){

		//creating object for Scanner class for geting input from user
        	Scanner sc=new Scanner(System.in);

		//declaring variable
		int size;

		//give choice for selection shirts
		System.out.println("Enter Size of shirts 32,36,40,42,46");

		//taking input from user
		size = sc.nextInt();
		
		//uses switch statement
		switch(size){

		//used default case for no match any cases
		default:
		System.out.println("Enter valid choice");

		//used first case for switch statement for small size
		case 32:
		System.out.println("Size is Small ");
		break;
		
		//case for medium
		case 36:
		System.out.println("Size is medium ");
		break;

		//case for large
		case 40:
		System.out.println("Size is large");
		break;

		//case for extra large
		case 42:
		System.out.println("Size is extra large");
  		break;

		//case for xxL
  		case 46:
		System.out.println("Size is XXL");
   		break;
		
		}

		
	}

}