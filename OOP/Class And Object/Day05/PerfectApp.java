/*
Q3. WAP to create class name as Perfect with two functions 
void setValue(): this function can accept number as parameter 
void checkPerfect(): this function can check number is perfect or not if perfect the show message number is perfect if not then show message number is not perfect

*/

import java.util.Scanner;
class Perfect
{
	private int num;
	public void setNum(int num)
	{
		this.num=num;
	}

	public void getPer()
	{
		int sum=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				sum +=i;
			}
		}

		if(sum==num)
			System.out.println("Number is PErfect Nujmber");
		else
			System.out.println("Number not Perfect Number");
	}
}
class PerfectApp
{
	public static void main(String[] args)	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A number");
		int num=sc.nextInt();

		Perfect p=new Perfect();
		p.setNum(num);
		p.getPer();

		
	}
}