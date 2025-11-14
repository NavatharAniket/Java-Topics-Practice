/*

Q5. WAP to create class name as CountDigit with two functions 
 void setValue(): this function can accept number from keyboard 
 void showDigitCount(): this function can count the digit and display it.

*/

import java.util.Scanner;
class CountDigit
{
	private int num;
	public void setNum(int num)
	{
		this.num=num;
	}

	public void getCount()
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}
class CountDigitApp
{
	public static void main(String[] args)	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A number");
		int num=sc.nextInt();

		CountDigit p=new CountDigit();
		p.setNum(num);
		p.getCount();

		
	}
}