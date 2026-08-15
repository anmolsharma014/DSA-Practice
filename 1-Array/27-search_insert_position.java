class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }
}
// Leetcode Problem: Search Insert Position
// Approach: Use binary search to find the target; if not found, return left, the correct insertion position.
// Time Complexity:  O(n)
// Space Complexity: O(1)
