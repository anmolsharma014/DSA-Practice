class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while (p2 >= 0) {
            int val;
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                val = nums1[p1];
                p1--;
            } else {
                val = nums2[p2];
                p2--;
            }
            nums1[p3] = val;
            p3--;
        }
    }
}
// Leetcode Problem: Merge Sorted Array
// Approach: Merge both sorted arrays from the end using three pointers, placing the larger element at the last available position in nums1.
// Time Complexity:  O(n+m)
// Space Complexity: O(1)
