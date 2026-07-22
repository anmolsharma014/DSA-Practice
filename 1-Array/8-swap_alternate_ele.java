class Solution {
    public static void swapAlternate(int[] arr) {
        for(int i=0;i<arr.length-1;i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
// Problem: Swap every pair of alternate elements.
// Example: [9,3,6,12,4,32] → [3,9,12,6,32,4]
// Approach: Traverse the array in steps of 2 and swap each element with its next adjacent element.
// Time Complexity: O(n)
// Space Complexity: O(1)
