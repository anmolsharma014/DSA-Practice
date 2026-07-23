class Solution {
    public void swapElements(int[] arr) {
        for(int i=0;i<arr.length-2;i++) {
            int temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = temp;
        }
    }
}
// GFG Problem: Swap the array elements
// Approach: Traverse the array and swap each element with the element at index i+2.
// Time Complexity: O(n)
// Space Complexity: O(1)
