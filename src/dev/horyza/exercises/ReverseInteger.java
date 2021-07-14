package dev.horyza.exercises;

public class ReverseInteger {

	/*
	 * Given a signed 32-bit integer x, return x with its digits reversed. If
	 * reversing x causes the value to go outside the signed 32-bit integer range
	 * [-231, 231 - 1], then return 0
	 */

	public static void main(String[] args) {
		int[] testVals = {123, 321, -123, -321, 1200000009, -1200000009};
		for (int val : testVals) {
			System.out.println(reverseInteger(val));
		}
	}
	
	private static int reverseInteger(int x) {
		String[] nums = Integer.toString(x).replace("-", "").split("");
		String reverse = x < 0 ? "-" : "";
		
		for (int i = nums.length - 1; i >= 0; i--) {
			reverse += nums[i];
		}
		
		try {
			return Integer.parseInt(reverse);
		} catch (Exception e) {
			return 0;
		}
	}

}
