import java.util.Scanner;

abstract class StringOperation
{
	String str;
	void setString(String str)
	{
		this.str=str;
	}	
	abstract void StringOperation();
}

class ConvertToUpper extends  StringOperation
{
	void StringOperation()
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='z')
			{
				String s = str.subString(0,i-1)+
			}
		}
	}
}

class MaxRepetativeChar extends StringOperation
{

}

class WordReverse extends StringOperation
{

}

class StringOperationApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
	}
}