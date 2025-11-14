/*
Q4. Count the Number of Occurrences of a Target
___________________________________________________________________
Given a sorted array of integers, find the number of occurrences of a given target value.
 Your algorithm’s runtime complexity must be in the order of O(log n).
 If the target is not found in the array, return 0
**Example : **
 Given [5, 7, 7, 8, 8, 10] and target value 8,
 return 2.
 Your Task:  you have to create class name as FindOccurence with two methods 
void setArray(int a[]): this function can accept integer array as parameter 
int findOccurence(int target): this function can accept key as parameter and find occurence of every element in array using binary search and return it.

*/


class CountNumberOccurrences {
    static int countFreq(int[] arr, int target) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
          
            if (arr[i] == target)
                res++;
        }
      
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int target = 2;
        System.out.println(countFreq(arr, target));
    }
}
