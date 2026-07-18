class Solution {
    public int arraySum(int arr[]) {
        int sum = 0;
        for(int x:arr) {
            sum += x;
        }
        return sum;
    }
}
// GFG Problem: Sum of Array
// Approach: Traverse the array once and keep adding each element to a sum variable.
// Time Complexity: O(n)
// Space Complexity: O(1)
