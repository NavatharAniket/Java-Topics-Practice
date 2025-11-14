/*
Q2. Write program to create class name as CheckChar with two functions
        void setChar(char ch): this function accept single character as input
      boolean checkChar(): this function can check character is alphabet or digit of special symbol if
     character is alphabet or digit return true if character is digit then return false.

*/

import java.util.Scanner;
class CheckChar
{
	char ch;
	void setChar(char ch)
	{
		this.ch=ch;
	}

	boolean checkChar()
	{
		int i=ch-0;
		if(i>=0 && i<10)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
class CheckCharApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		CheckChar ch=new CheckChar();
		ch.setChar(sc.next().charAt(0));
		System.out.println(ch.checkChar());
		
	}
}