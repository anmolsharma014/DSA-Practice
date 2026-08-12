class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            if (map.containsKey(ele) && i - map.get(ele) <= k)
                return true;
            map.put(ele, i);
        }
        return false;
    }
}
// Leetcode Problem: Contains Duplicate II
// Approach: Use a HashMap to store the latest index of each element and check whether its previous occurrence is within k indices of the current index.
// Time Complexity: O(n)
// Space Complexity: O(n)
