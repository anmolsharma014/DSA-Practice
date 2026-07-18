class Solution {
    public static int largest(int[] arr) {
        int max = arr[0];
        for(int x:arr) {
            if(x > max) {
                max = x;
            }
        }
        return max;
    }
}
// GFG Problem: Largest in Array
// Approach: Traverse the array and keep updating a variable with the maximum value found so far.
// Time Complexity: O(n)
// Space Complexity: O(1)
