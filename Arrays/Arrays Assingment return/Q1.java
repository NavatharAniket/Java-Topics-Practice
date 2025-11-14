/*
Q1. WAP to create character array of size 5 and convert lower case character array to uppercase character array
*/

class Q1
{
	public void lowerTOUpper(char[] ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			ch[i]-=32;
			System.out.print(ch[i]+" ");
			
		}
		
	}
	public static void main(String[] args)
	{
		char[] ch={'a','s','d','f','g'};
		Q1 Q1=new Q1();
		Q1.lowerTOUpper(ch);
		//System.out.println('a'-'A');
	}
}