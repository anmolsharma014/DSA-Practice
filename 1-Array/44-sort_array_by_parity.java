class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        return arr;
    }
}
// Leetcode Problem: Sort Array By Parity
// Approach: Use two pointers to place all even elements at the beginning of the array.
// Time Complexity:  O(n)
// Space Complexity: O(1)
