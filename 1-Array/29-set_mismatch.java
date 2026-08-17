class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = 0;
        int missing = 0;
        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                duplicate = nums[i];
                missing = i + 1;
            }
        }
        return new int[] { duplicate, missing };
    }
}
// Leetcode Problem: Set Mismatch
// Approach: Use cyclic sort to place each number at its correct index, then find the index where the number mismatches to identify the duplicate and missing number.
// Time Complexity:  O(n)
// Space Complexity: O(1)
