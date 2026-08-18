class Solution {
    public int[] plusOne(int[] digits) {
        int count = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }
}
// Leetcode Problem: Plus One
// Approach: Traverse from right to left, increment the first digit that is not 9; turn trailing 9s into 0, and create a new array if all digits are 9.
// Time Complexity:  O(n)
// Space Complexity: O(1)
