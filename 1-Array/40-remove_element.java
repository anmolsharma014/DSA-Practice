class Solution {
    public int removeElement(int[] nums, int val) {
        int write = 0;
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != val) {
                nums[write] = nums[read];
                write++;
            }
        }
        return write;
    }
}
// Leetcode Problem: Remove Element
// Approach: Use a read pointer to scan the array and a write pointer to store only non-val elements.
// Time Complexity:  O(n)
// Space Complexity: O(1)
