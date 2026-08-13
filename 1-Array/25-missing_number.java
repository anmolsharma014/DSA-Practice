class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1 = n * (n + 1) / 2;
        int sum2 = 0;
        for (int x : nums) {
            sum2 += x;
        }
        return sum1 - sum2;
    }
}
// Leetcode Problem: Missing Number
// Approach: Calculate the expected sum of numbers from 0 to n and subtract the actual sum of array elements to find the missing number.
// Time Complexity:  O(n)
// Space Complexity: O(1)
