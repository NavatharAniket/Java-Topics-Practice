import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class StringOperation
{
	String str;
	Set<Character> nr=new HashSet<>();
	public StringOperation(String str)
	{
		this.str=str;
	}

	public int longestSubString()
	{
		int count=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<str.length();i++)
		{
			boolean temp = nr.add(str.charAt(i));
			if(!temp)
			{
				if(max<nr.size())
				{
					max=nr.size();
				}
			nr=new HashSet<>();
			i--;
			}	
			else
			{
				System.out.println("Add "+str.charAt(i));
			}

		
			
		}

		if(max<nr.size())
		{
			max=nr.size();
		}
		
		return max;

		
	}
}

class Q4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();

		StringOperation so=new StringOperation(str);
		System.out.println(so.longestSubString());
		
	}
}