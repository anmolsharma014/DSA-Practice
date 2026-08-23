class Solution {
    public int findDuplicate(int[] nums) {
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
                return nums[i];
            }
        }
        return -1;
    }
}
// Leetcode Problem: Find the Duplicate Number
// Approach: Use a cyclic sort
// Time Complexity: O(n)
// Space Complexity: O(1)
