/*
* Given an array of integers, return indices(标记) of the two numbers such that they add up to a specific target.
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
* */

/*Example:
		Given nums = [2, 7, 11, 15], target = 9,

		Because nums[0] + nums[1] = 2 + 7 = 9,
		return [0, 1].
*/

import java.util.*;

public class _0001_E_Two_Sum {
	public static void main(String[] args) {
	}
}

class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] incide = new int[2];
		for(int i = 0 ; i < nums.length ; i++){
			for(int j = i + 1 ; j < nums.length ; j++){
				if(nums[i]+nums[j] == target){
					incide[0] = i;
					incide[1] = j;
					return incide;
				}
			}
		}
		return incide;
	}
}