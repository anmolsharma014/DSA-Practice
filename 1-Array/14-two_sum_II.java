class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] {};
    }
}
// Leetcode Problem: Two Sum II - Input Array Is Sorted
// Approach: Use two pointers (left at start, right at end), move pointers based on comparison of sum with target.
// Time Complexity: O(n)
// Space Complexity: O(1)
