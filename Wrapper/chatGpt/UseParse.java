/*

Parse a String "12345" into int, double, and long using wrapper methods.

*/

class UseParse
{
	public static void main(String[] args)
	{
		String str="12345";
		int num = Integer.parseInt(str);
		double d=Double.parseDouble(str);

		System.out.println("Integer "+num+" Double "+d);
	}
}