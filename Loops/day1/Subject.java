import java.util.Scanner;
class Subject{
public static void main(String[] args){

Scanner sc =new Scanner(System.in);

System.out.println("Enter 1st Subject");
int sub1 = sc.nextInt();
System.out.println("Enter 2nd Subject");
int sub2 = sc.nextInt();
System.out.println("Enter 3rd Subject");
int sub3 = sc.nextInt();
System.out.println("Enter 4th Subject");
int sub4 = sc.nextInt();
System.out.println("Enter 5th Subject");
int sub5 = sc.nextInt();

int Sub = (sub1+sub2+sub3+sub4+sub5)*100;
int avg = Sub/500;

if(avg>=90){
System.out.println("A");
}

if( avg < 90 &&avg>=80){
     System.out.println("B");
}

if(avg<80 && avg>=70){
System.out.println("c");
}

if(avg<70 && avg>=60){
System.out.println("D");
}

if(avg<60){
System.out.println("Fail");
}

System.out.println("% is "+avg);
}
}