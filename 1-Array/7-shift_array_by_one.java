class Solution {
    public static void shiftBy1(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}
// Problem: Shift array elements by 1 (Right Rotation)
// Example: [10,20,30,40,50] → [50,10,20,30,40]
// Approach: Store the last element, shift all elements one position to the right, and place the stored element at the first index.
// Time Complexity: O(n)
// Space Complexity: O(1)
