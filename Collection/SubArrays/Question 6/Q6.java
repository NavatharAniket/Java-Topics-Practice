import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

class Distinct
{
	String str;
	int key;
	
	public Distinct(String str,int key)
	{
		this.str=str;
		this.key=key;
	}

	public void getArray()
	{
		Map<Character,Integer> hm=new LinkedHashMap<Character,Integer>();

		int j=0;
		int distinct=0;
		for(int i=0;i<str.length();i++)	
		{
			char ch=str.charAt(i);
			Integer count=hm.get(i);
			if(count==null)
			{
				count=0;
				distinct++;
			}

			
			count++;
			if(distinct>key)
			{
				char ch1=str.length(j);
				Integer num=hm.get(ch1);
				if(num>1)
				{
					--num;
					hm.put(ch1,num);
				}
				else
				{
						--num;
					hm.put(ch1,num);
					distinct--;
				}
				j++;
				i--;fff
			}
			else
			{
				hm.put(ch,count);
			}
		}
}
class Q6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String");
		String str=sc.nextLine();

		System.out.println("Enter Distinct Character Number");
		int key=sc.nextInt();

		Distinct d=new Distinct(str,key);
		d.getArray();
	}
}