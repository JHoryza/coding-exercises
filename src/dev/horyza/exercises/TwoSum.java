package dev.horyza.exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	/* Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * You can return the answer in any order.*/
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		String solution = Arrays.toString(twoSum(nums, target));
		System.out.println(solution);
	}
	
	private static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numsMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (numsMap.containsKey(target - nums[i])) {
				return new int[] {numsMap.get(target - nums[i]), i};
			}
			numsMap.put(nums[i], i);
		}
		return new int[] {};
	}

}
