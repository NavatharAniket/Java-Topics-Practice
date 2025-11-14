/*
Q1. WAP to create class name as Perfect with two methods 
void setNum(int no): this function can accept number as parameter 
void findPerfect(): this function can check number is perfect or not

*/

class Perfect
{
	int num;
	public void setNum(int no)
	{
		num=no;
			
	}
	public void findPerfect()
	{
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			
		}
		if(num==sum)
			System.out.println("number is perfect numbert");
		else
			System.out.println("number is not a perfect number");
	}
	public static void main(String[] args)
	{
		Perfect p=new Perfect();
		p.setNum(6);
		p.findPerfect();	
	}
}