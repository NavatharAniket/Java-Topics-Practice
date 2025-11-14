/*
Q4. WAP to create  class name as Rev with two functions 
   void setValue(): this function is used for accept number 
   void showRev(): this function is used for reverse the number

*/

class Rev
{
	int num;
	public void setValue(int x)
	{
		num=x;
	}
	public void showRev()
	{
		int temp=0;
		while(num>0)
		{
			int fact = num%10;
			num = num/10;
			temp=temp*10+fact;
		}
		num=temp;
		System.out.println(num);
	}
	public static void main(String[] args)
	{
		Rev r= new Rev();
		r.setValue(6484646);
		r.showRev();
	}
}