class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                int index = map.get(diff);
                return new int[] { index, i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
// Leetcode Problem: Two Sum
// Approach: Traverse the array and use a HashMap to store elements with their indices. For each element, check if (target - current element) exists in the map. If yes, return the indices.
// Time Complexity: O(n)
// Space Complexity: O(n)
