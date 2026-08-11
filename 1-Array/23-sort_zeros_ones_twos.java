class Solution {
    public void sortColors(int[] nums) {
        int w = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 1 && nums[r] != 2) {
                int temp = nums[w];
                nums[w] = nums[r];
                nums[r] = temp;
                w++;
            }
        }
        for (int r = w; r < nums.length; r++) {
            if (nums[r] != 2) {
                int temp = nums[w];
                nums[w] = nums[r];
                nums[r] = temp;
                w++;
            }
        }
    }
}
// Leetcode Problem: Sort Colors
// Approach: Use two passes with a write pointer to first place all 0s, then all 1s, leaving 2s at the end.
// Time Complexity: O(2n)---> O(n)
// Space Complexity: O(1)
