import java.util.Scanner;
class Digit{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num = sc.nextInt();

	int nDigit = 0;

	while(num > 0){
	
        num = num / 10;
        nDigit++;
	
	}

System.out.println(nDigit);
	
}
}