/*
Q.1 WAP to Create a class name as MergeArray With Function.

void mergeArray(int [ ] , int [ ])
{
// this function can accept the array.
}
void performMeger( ) 
{
//this function can use merge two array.
}

void sortDesc()
{
//Sort merge array in descending order.
}


Q.2 WAP to Create a class name as PalindromeApp with create function name as :

void setArray(int [ ] , int [ ])
{
// this function can accept the array.
}
void checkPalindrome(int [ ])
{
//this function can use the array is palindrome or not.
}


Q.3 WAP to Create a class name as StudentPer with function.

void setStudentPer(int [ ])
{
// this function can accept the array.
}
void CalPer( ) 
{
//this function can use calculate the percentage in array.
}

void checkGrades()
{
//this function can use check the grade.
		percentage >= 90% : Grade A
 		percentage >= 80% : Grade B
		percentage >= 70% : Grade C
		percentage >= 60% : Grade D
		percentage >= 50% : Grade E
		percentage >= 40% : Grade F
		percentage < 40% : Student is Fail.
}


Q4. Write a program to create class name as UnionApp using function name as :

	void setArray(int [ ] , int [ ])
	{
	// this function can accept the array.
	}
	void majorityApp()
	{
		//  Check array is Majority or Not.
	}
	
	void unionApp()
	{
		//  Check Array Is Union or Not.
	}

*/

import java.util.Scanner;

class MergeArrayWithFunction
{	
	int arr[],arr2[],merg[];
	Scanner sc=new Scanner(System.in);
	void mergeArray()
	{
		//Scanner sc=new Scanner(System.in);
		int[] x = new int[5];
		int[] y = new int[5];
		System.out.println("Enter elements in 1st arrays ");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
			
		}
		System.out.println("Enter elements in 2st arrays ");
		for(int i=0;i<y.length;i++)
		{
			y[i]=sc.nextInt();
			
		}
		
		arr=x;
		arr2=y;
		performMeger();
	}


	void performMeger( ) 
	{
		merg=new int[10];
		
		for(int i=0,k=0;i<merg.length;i++)
		{
			if(i<5)
			{
				merg[i]=arr[i];
			}
			if(i>4)
			{
				
				merg[i]=arr2[k];
				k++;
			}
			//System.out.print(" "+i);
		}
		
		showNow();
		sortDesc();
	}

	void showNow()
	{
		for(int i=0;i<merg.length;i++)
		{
			System.out.print(" "+merg[i]);
		}
	}

	void sortDesc()
	{
		for(int i=0;i<merg.length;i++)
		{
			for(int j=i+1;j<merg.length;j++)
			{
				if(merg[i]>merg[j])
				{
					int temp=merg[i];
					merg[i]=merg[j];
					merg[j]=temp;
				}
			}
		}
		show();
	}

	void show()
	{
		System.out.println();
		for(int i=0;i<merg.length;i++)
		{
			System.out.print(" "+merg[i]);
		}
	}


}


class PalindromeApp
{
	int arr[];
	Scanner sc=new Scanner(System.in);
	void setArray()
	{
		//Scanner sc=new Scanner(System.in);
		int[] x = new int[5];
		System.out.println("Enter elements in 1st arrays ");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
			
		}
		
		
		arr=x;
		palindrom();
	}

	void palindrom()
	{
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr[arr.length-1-i])
			{
				flag=true;
			}
		}
		if(flag)
			System.out.println("Array is not Palindrome");
		else
			System.out.println("Array is Palindrome");
	}

}



class StudentPer
{
	int[][] x;
	int[] per;
	Scanner sc=new Scanner(System.in);
	void setStudentPer()
	{
		int[][] arr=new int[5][5];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i]=sc.nextInt();
			}
		}
		x=arr;
	}

	void CalPer( ) 
	{
		for(int i=0;i<x.length;i++)
		{
			int sum=0;
			for(int j=0;j<x[i].length;j++)
			{
				sum += x[i][j];
			}
			sum = (per*100)/500;
			per[i]=sum;
		}
	}

void checkGrades()
{
	for(int i=0;i<per.length;i++)
	{
		switch(i)
		{
			case 90:
				System.out.println("percentage >= 90% : Grade A");
				break;
 			case 80:
				System.out.println("percentage >= 80% : Grade B");
				break;
			case 70:
				System.out.println("percentage >= 70% : Grade C");
				break;
		 	case 60:
				System.out.println("percentage >= 60% : Grade D");
				break;
			case 50:
				percentage >= 50% : Grade E
				break;
			case 40:
				System.out.println("percentage >= 40% : Grade F");
				break;
			default:
				System.out.println("percentage < 40% : Student is Fail.");
				break;
		}
	}
}


}


class UnionApp
{
	void setArray()
	{
	// this function can accept the array.
	}
	void majorityApp()
	{
		//  Check array is Majority or Not.
	}
	
	void unionApp()
	{
		//  Check Array Is Union or Not.
	}
}
whatste
public class App
{ 

	public static void main(String[] args)
	{

		//Scanner sc = new Scanner(System.in);
		//MergeArrayWithFunction maf = new MergeArrayWithFunction();
		//System.out.println("enter elements in arrays ");
		//maf.mergeArray();

		/*PalindromeApp pa=new PalindromeApp();
		pa.setArray();*/
	}
}
