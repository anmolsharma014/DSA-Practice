class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1, i = n - 1;
        int[] arr = new int[n];

        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                arr[i] = nums[right] * nums[right];
                right--;
            } else {
                arr[i] = nums[left] * nums[left];
                left++;
            }
            i--;
        }
        return arr;
    }
}
// Leetcode Problem: Squares of a Sorted Array
// Approach: Use two pointers from both ends, compare absolute values, and place the larger square from right to left in a new array.
// Time Complexity:  O(n)
// Space Complexity: O(n)
