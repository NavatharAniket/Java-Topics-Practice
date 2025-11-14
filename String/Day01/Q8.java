import java.util.Scanner;
class Q8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter Size of Array");
		int c=sc.nextInt();
		char ch[]=new char[c];
		System.out.println("Enter Elements in arrays ");
		//fill arrays
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		int vol=0,con=0,sp=0,dig=0;

		//chack conditions
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' ||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				vol++;
			if(ch[i]=='A' ||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
				vol++;
																										else if(ch[i]=='q'||ch[i]=='w'||ch[i]=='r'||ch[i]=='t'||ch[i]=='y'||ch[i]=='p'||ch[i]=='s'||ch[i]=='d'||ch[i]=='f'||ch[i]=='g'||ch[i]=='h'||ch[i]=='j'||
				ch[i]=='k'||ch[i]=='l'||ch[i]=='z'||ch[i]=='x'||ch[i]=='c'||ch[i]=='v'||ch[i]=='b'||ch[i]=='n'||ch[i]=='m')
					con++;
			else if(ch[i]=='Q'||ch[i]=='W'||ch[i]=='R'||ch[i]=='T'||ch[i]=='Y'||ch[i]=='P'||ch[i]=='S'||ch[i]=='D'||ch[i]=='F'||ch[i]=='G'||ch[i]=='H'||ch[i]=='J'||
				ch[i]=='K'||ch[i]=='L'||ch[i]=='Z'||ch[i]=='X'||ch[i]=='C'||ch[i]=='V'||ch[i]=='B'||ch[i]=='N'||ch[i]=='M')
					con++;
			else if(ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9')
				dig++;
			else
				sp++;		
		}

		//print values
		System.out.println("Total number of vowels "+vol);
		System.out.println("Total number of consonates"+con);
		System.out.println("Total number of Alphabets "+(vol+con));
		System.out.println("Total number of digits "+dig);
		System.out.println("Total number of special Symbol "+sp);

		
	}

	
}
}