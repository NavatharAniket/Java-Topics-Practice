import java.util.Scanner;
class Length
{
	public static int findLength(String name)
	{
		return name.length();
	}
	public static void main(String[] args)
	{
		String name="Aniket";
		int a=findLength(name);
		System.out.println(a);
		
	}
}