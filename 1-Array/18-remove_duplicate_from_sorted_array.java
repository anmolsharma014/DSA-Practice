class Solution {
    public int removeDuplicates(int[] nums) {
       int write = 0;
        for (int read = 1; read < nums.length; read++) {
            if (nums[write] != nums[read]) {
                ++write;
                nums[write] = nums[read];
            }
        }
        return write + 1;
    }
}
// Leetcode Problem: Remove Duplicates from Sorted Array
// Approach: Use two pointers to traverse the sorted array and overwrite duplicates in-place, keeping only unique elements.
// Time Complexity: O(n)
// Space Complexity: O(1)
