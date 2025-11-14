/*
Q2.  Find the Minimum in a Rotated Sorted Array


Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
 For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]]
 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, 
return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

 
Your Task: you have to create class name as FindMinimumRotation with following methods 
void setArray(int a[]): this function can accept array as parameter 
void findMinRotationArray(): this function can find the minimum rotation of array.

Note: use binary search technique.

*/

import java.util.*;
class FindMinimumInRotatedArray{
	private int a[];
	public void setArray(int a[]){
		this.a=a;
	}
	public void findMinimumRotated(){
		if (a == null || a.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element, minimum is in the right half
            if (a[mid] > a[right]) {
                left = mid + 1;
            } 
            // If mid element is less than or equal to the rightmost element, minimum is in the left half or at mid
            else {
                right = mid;
            }
        }

        // At the end of the loop, left == right, and this is the minimum element
        System.out.println("The minimum element is: " + a[left]);
	}

}
public class FindMinimumInRotatedArrayApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[]= new int [7];
		System.out.println("Enter the value of Array");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		FindMinimumInRotatedArray aa = new FindMinimumInRotatedArray();
		aa.setArray(a);
		aa.findMinimumRotated();
	}
}