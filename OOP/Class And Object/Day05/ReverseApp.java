/*
Q4. WAP to create class name as Reverse with two functions 
void setNumber(): this function can accept the number from keyboard 
void reverseNumber(): this function can reverse the number and display it

*/


import java.util.Scanner;
class Reverse
{
	private int num;
	public void setNum(int num)
	{
		this.num=num;
	}

	public void getRev()
	{
		int temp=num;
		int rev=0;
		while(temp>0)
		{
			int dig=temp%10;
			temp=temp/10;
			rev = rev*10+dig;
		}

		System.out.println(rev);
	}
}
class ReverseApp
{
	public static void main(String[] args)	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A number");
		int num=sc.nextInt();

		Reverse r=new Reverse();
		r.setNum(num);
		r.getRev();

		
	}
}