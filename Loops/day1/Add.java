import java.util.Scanner;
class Add{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter 1 number");

int num1 = sc.nextInt();
System.out.println("enter 2 number");

int num2 = sc.nextInt();

int Sum = num1+num2;

System.out.println("Sum is "+ Sum);

}
}