import java.util.Scanner;
class ValidParenthesisString
{
	public static boolean validString(String str)
	{
		int count=0,temp=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				count++;
			}
			else if(str.charAt(i)==')')
			{
				count--;
			}
			else
			{
				temp++;
			}
		}
	}

	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		System.out.println(validString(str));
	}

}