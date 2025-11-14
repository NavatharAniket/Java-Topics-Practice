import java.util.Scanner;

class Sqrt {
    public static void main(String[] args)
 {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();

        long sqrt = 0;
        for(long i =1 ; i <= x/2 ; i++)
        {
		long k = i*i;
            if(k <= x)
            {	
                sqrt = i ;
            }
        }
        if(x == 1)
        {
            sqrt = 1;
        }

        System.out.println( sqrt);
    }
}