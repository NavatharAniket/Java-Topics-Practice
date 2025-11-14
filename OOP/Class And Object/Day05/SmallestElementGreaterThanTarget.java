/*
Given a sorted array and a target, find the smallest element in the array that is greater than the target.
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:
Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that are lexicographically greater than 'z' so we return letters[0].
Your Task: you have to create class name as SmallestGreaterThan with following methods 
void acceptArray(char a[]): this function can accept character array as input 
void findSmallestChar(char skey): this function accept search key as parameter and find the greater element 
  Note: you have to use binary search algorithm
*/

class SmallestElementGreaterThanTarget
{
    public static int findLastOccurrence(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length - 1;
 
        int result = -1;
 
        while (left <= right)
        {
            int mid = (left + right) / 2;
 
            if (target == nums[mid])
            {
                result = mid;
                left = mid + 1;
            }
 
            else if (target < nums[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
 
        return result;
    }
 
    public static void main(String[] args)
    {
        int[] nums = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
 
        int index = findLastOccurrence(nums, target);
 
        if (index != -1)
        {
            System.out.println("The last occurrence of element " + target +
                    " is located at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }