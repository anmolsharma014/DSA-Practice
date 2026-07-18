class Solution {
    public int search(int arr[], int x) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==x) {
                return i;
            }
        }
        return -1;
    }
}
// GFG Problem: Array Search
// Approach: Traverse the array sequentially and compare each element with the target until it is found or the array ends.
// Time Complexity: O(n)
// Space Complexity: O(1)
