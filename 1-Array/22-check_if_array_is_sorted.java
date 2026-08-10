class Solution {
    public boolean isSorted(int[] arr) {
       for(int i=1;i<arr.length;i++) {
           if(arr[i] < arr[i-1])
                return false;
       }
       return true;
    }
}
// GFG Problem: Check Sorted Array
// Approach: Traverse the array once and check if every element is greater than or equal to its previous element; if any violation occurs, the array is not sorted.
// Time Complexity: O(n)
// Space Complexity: O(1)
