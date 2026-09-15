class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (x > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = x;
            } else if (x > secondMax && x != firstMax) {
                thirdMax = secondMax;
                secondMax = x;
            } else if (x > thirdMax && x != secondMax && x != firstMax) {
                thirdMax = x;
            }
        }
        if (thirdMax == Long.MIN_VALUE)
            return (int) firstMax;
        return (int) thirdMax;
    }
}
// Leetcode Problem: Third Maximum Number
// Approach: Track the three largest distinct numbers using three variables.
// Time Complexity:  O(n)
// Space Complexity: O(1)
