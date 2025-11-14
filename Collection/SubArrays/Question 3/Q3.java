import java.util.Deque;
import java.util.Scanner;
import java.util.LinkedListDequeue;
import java.util.HashMap;

class SlidingWindowForStringAnyagram
{
	String str;
	String text;
	hashMap<char,int>hash=new hashMap<>();
	public SlidingWindowForStringAnyagram(String str,String text)
	{
		this.str=str;
		this.text=text;
	}

	public int getAnyagramNumber()
	{
		int count=0;
		int window=text.length();
		for(int i=0;i<str.length();i++)
		{
			hashMap<char,int>hash=new hashMap<>();
						
		}

		return count;
	}
}
class Q3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence ");
		String str=sc.nextLine();
		
		System.out.println("Enter text for check Anyagram");
		String text=sc.nextLine();		

		SlidingWindowForStringAnyagram st=new SlidingWindowForStringAnyagram(str,text);
		System.out.println("Ans is "+ getAnyagramNumber());

		
	}

}