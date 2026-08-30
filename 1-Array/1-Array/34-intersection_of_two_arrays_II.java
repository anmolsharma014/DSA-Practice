class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = Math.min(nums1.length, nums2.length);
        int[] arr = new int[n];
        int k = 0, i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                arr[k] = nums1[i];
                k++;
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return Arrays.copyOfRange(arr, 0, k);
    }
}
// Leetcode Problem: Intersection of Two Arrays II
// Approach: Sort both arrays, then use two pointers to find common elements including duplicates.
// Time Complexity:  O(nlogn + mlogm)
// Space Complexity: O(min(n, m))
