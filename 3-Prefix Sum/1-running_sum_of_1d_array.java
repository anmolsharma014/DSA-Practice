class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
// Leetcode Problem: Running Sum of 1d Array
// Approach: Traverse the array and add the previous element’s running sum to the current element.
// Time Complexity:  O(n)
// Space Complexity: O(1)
