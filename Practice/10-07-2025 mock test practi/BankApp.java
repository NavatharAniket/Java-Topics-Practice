class BankAccount
{
	String accountNumber;
	double balance;
		
	public BankAccount(String accountNumber, doule balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}

	public String getAccountNumber()
	{
		return AccountNumber;
	}

	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}

	public void diposite(dounle amount)
	{
		if(amount<=0)
		{
			System.out.println("Wrong amount");
		}
		else
		{
			setBalance(amount);
		}
	}

	public void withDwow(double amount)
	{
		if(amount<getBalance)
		{
			System.out.println("Insufficient Fund");
		}
		else if(amount <=0)
		{
			System.out.println("Enter Valid Amount");
		}	
		else
		{
			double d=getBalance()-amount;
			setBalance(d);
		}
	}
}


class SavingAccount extends BankAccount
{
	double interestRate;
	void ApplyInrest()
	{
			
	}
}
class BankApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
	}
}