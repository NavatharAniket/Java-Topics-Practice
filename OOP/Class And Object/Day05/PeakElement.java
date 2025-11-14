/* Q1.  Find the Peak Element in an Array
A peak element is an element that is greater than its neighbours. Find a peak element in an array.
A peak element is an element that is strictly greater than its neighbors. Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞. In other words, 
an element is always considered to be strictly greater than a neighbor that
 is outside the array.
You must write an algorithm that runs in O(log n) time.
Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
*/

import java.util.*;
class PeakElement
{
 int a[];  
 void setPeak(int a[])
 {
  this.a=a;
 }
 void findPeak()
 {
	 int start = 0;
	 int end = a.length-1;
m
	 while(start < end)   //0<3
	 {
		int mid = start + (end - start)/2;   //0+(3-0)/2=3;
		if(a[mid] > a[mid + 1]) //3>
			{
				end = mid;    // Peak is on the left half (including mid); 
			}
		else
			{
				start = mid + 1;  // Peak is on the right half;
			}
	 }
	     // Print the peak element and its index 
	  System.out.println("Peak element: " + a[start] + " at index: " + start);
       
 }
 
}
public class Q1_Find_Peak_Ele
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  int a[] = new int[4];
  System.out.println("Enter a Value's in Array");
  for(int i=0;i<a.length;i++)
  {
   a[i] = sc.nextInt();
  }
  PeakElement pe = new PeakElement();
  pe.setPeak(a);
  pe.findPeak();
  
 }
}
/*
Enter a Value's in Array:= 1 2 3 1;
Peak element: 3 at index: 2
*/