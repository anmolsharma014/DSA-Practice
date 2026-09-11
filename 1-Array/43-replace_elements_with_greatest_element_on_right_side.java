class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length - 1;
        int temp = arr[n];
        arr[n] = -1;
        for (int i = n; i > 0; i--) {
            int max = Math.max(temp, arr[i]);
            temp = arr[i - 1];
            arr[i - 1] = max;
        }
        return arr;
    }
}
// Leetcode Problem: Replace Elements with Greatest Element on Right Side
// Approach: Traverse from right to left while keeping track of the maximum element seen so far, and replace each element with that maximum.
// Time Complexity:  O(n)
// Space Complexity: O(1)
