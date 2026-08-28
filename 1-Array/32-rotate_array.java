class Solution {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
}
// Leetcode Problem: Rotate Array
// Approach: Reverse the entire array, then reverse the first k elements and the remaining elements to rotate the array right by k positions.
// Time Complexity:  O(n)
// Space Complexity: O(1)
