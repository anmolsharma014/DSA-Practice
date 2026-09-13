class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int x : nums) {
            total += x;
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            int right = total - left - nums[i];
            if (left == right)
                return i;
            left += nums[i];
        }
        return -1;
    }
}
// Leetcode Problem: Find Pivot Index
// Approach: Keep total sum and running left sum, for each index calculate right = total - left - nums[i] and return i if left == right.
// Time Complexity:  O(n)
// Space Complexity: O(1)
