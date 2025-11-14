import java.util.Scanner;
class Interest
{
	int principle;
	int rate;
	int dur;
	void setPRD(int principle,int rate,int dur)
	{
		this.principle=principle;
		this.rate=rate;
		this.dur=dur;
	}
}

class CalculateInterest extends Interest
{
	void CalculateInterestfunct()
	{
		int interest=principle*rate*dur;
		System.out.println("Interest is "+interest);
	}
}


class InterestApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		CalculateInterest c=new CalculateInterest();
		System.out.println("Enter Principle");
		int p=sc.nextInt();

		System.out.println("Enter rate");
		int r=sc.nextInt();

		System.out.println("Enter Duration");
		int d=sc.nextInt();
		c.setPRD(p,r,d);
		c.CalculateInterestfunct();
		
	}
}