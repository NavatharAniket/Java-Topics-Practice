/*
Q2. WAP to create character array of size 15 and extract digit from character array and calculate sum of that digit
*/

import java.util.Scanner;

class Q2 {
    public void addNum(char[] ch) {    
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {  // Correct usage of array length
            if (ch[i] >= '0' && ch[i] <= '9') {  // Check if character is a digit
                sum += (ch[i] - '0');  // Convert the char to an integer and add to sum
            }
        }
        System.out.println("Sum of all numbers in character array is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = new char[15];  // Create an array of 15 characters

        // Prompt the user to input 15 characters
        System.out.println("Enter 15 characters:");
        for (int i = 0; i < ch.length; i++) {  // Loop through the array to read characters
            ch[i] = sc.next().charAt(0);  // Read the first character of the string input
        }

        Q2 q2 = new Q2();
        q2.addNum(ch);  // Call the addNum method to calculate the sum
    }
}
