class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] excepted = new int[n];
        for (int i = 0; i < n; i++) {
            excepted[i] = heights[i];
        }
        Arrays.sort(excepted);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != excepted[i])
                count++;
        }
        return count;
    }
}
// Leetcode Problem: Height Checker
// Approach: Copy the array, sort the copy, and count positions where the original and sorted arrays differ.
// Time Complexity:  O(n log n)
// Space Complexity: O(n)
