import java.util.Scanner;
class Product{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a nnumber");
	int num = sc.nextInt();
	
	int k =1 ;
	int i = 1;


	while(k<=num && i<=10){
		System.out.println(k*i);
		
			
			if(i==10){
			k++;
			 i = 1;
			}
			i++;
		}
	}
}