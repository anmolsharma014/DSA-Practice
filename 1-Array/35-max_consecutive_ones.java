class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                count++;
            else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}
// Leetcode Problem: Max Consecutive Ones
// Approach: Traverse the array, maintain a running count of consecutive 1s, reset it at 0, and keep track of the maximum count.
// Time Complexity:  O(n)
// Space Complexity: O(1)
