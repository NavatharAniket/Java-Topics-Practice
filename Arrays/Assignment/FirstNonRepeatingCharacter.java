/*
Find the First Non-Repeating Character - Find the first character in a character array that does not repeat.
*/
 
import java.util.Scanner;
class FirstNonRepeatingCharacter
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char[] ch=new char[10];
		System.out.println("Enter elements in array");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		
		for(int i=0;i<ch.length;i++)
		{
					//System.out.print(" "+ ch[i]);

			boolean flag=true;
			for(int j=0;j<ch.length;j++)
			{
				//System.out.print(" "+ch[j]);

				if(ch[i]==ch[j] && i!=j)
				{
					flag=false;
					break;
				}
			}
							//System.out.println();

			if(flag)
			{
				System.out.println(ch[i]);
				break;
			}
		}	

	}
}