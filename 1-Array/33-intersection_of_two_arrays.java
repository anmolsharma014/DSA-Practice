class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int x : nums1) {
            set1.add(x);
        }

        for (int x : nums2) {
            set2.add(x);
        }
        int n = Math.min(set1.size(), set2.size());
        int[] arr = new int[n];
        int k = 0;
        for (int x : set1) {
            if (set2.contains(x)) {
                arr[k] = x;
                k++;
            }
        }
        return Arrays.copyOfRange(arr, 0, k);
    }
}
// Leetcode Problem: Intersection of Two Arrays
// Approach: Store unique elements of both arrays in HashSets, then collect the elements present in both sets.
// Time Complexity:  O(n+m)
// Space Complexity: O(n+m)
