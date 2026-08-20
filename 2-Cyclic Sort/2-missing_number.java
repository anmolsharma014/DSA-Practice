class Solution {
  public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int index = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
// Leetcode Problem: Missing Number
// Approach: Place each number x at index x, then scan for the first index where nums[i] != i; that index is the missing number.
// Time Complexity:  O(n)
// Space Complexity: O(1)
