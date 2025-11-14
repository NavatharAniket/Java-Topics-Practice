/*
Q3.Find the Position of an Element in a Sorted Array with Duplicates
Example:
Input: array = {0, 1, 2, 2, 4, 5, 5, 5, 8};
num = 5;
Output: Element 5 found at index 7

Your Task : you have to create class name as FindPosition with following methods 

void setArray(int a[]): this function can accept array as parameter 
void findPosition(int skey): this function can find the last index of search key if key is duplicated 

*/

import java.util.*;

class PositionElement {

    static ArrayList<Integer> find(int[] arr, int x) {
        int n = arr.length;
        
        int first = -1, last = -1;
        
        for (int i = 0; i < n; i++) {
            
            if (x != arr[i])
                continue;
            
            if (first == -1)
                first = i;
            
            // Update last occurrence
            last = i;
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(first);
        res.add(last);
        return res;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;
        ArrayList<Integer> res = find(arr, x);
        System.out.println(res.get(0) + " " + res.get(1));
    }
}
