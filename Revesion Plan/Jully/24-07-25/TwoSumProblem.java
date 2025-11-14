/*
Q2. Two Sum Problem?
Problem:Find indices of two numbers that add up to a target sum.
Approach: Use a Map<Integer, Integer> to store value → index.
Input: nums = [2, 7, 11, 15], target = 9  
Output: [0, 1]  
Explanation: nums[0] + nums[1] = 2 + 7 = 9
*/

import java.util.HashMap;
import java.util.Map;
class TwoSumProblem
{
	public static void main(String[] args)
	{
		int[] nums = {2, 7, 11, 15};
		int target = 9;

		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			int v=target-nums[i];
			if(m.containsKey(v))
			{
				System.out.println(m.get(v)+" "+i);
				break;
			}

			m.put(nums[i],i);
		}
	}
}