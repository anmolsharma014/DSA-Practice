class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : nums) {
            if (map.get(x) == 1) {
                return x;
            }
        }
        return -1;
    }
}
// Leetcode Problem: Single Number
// Approach: Use a HashMap to count the frequency of each element, then return the element whose frequency is exactly 1.
// Time Complexity:  O(n)
// Space Complexity: O(1)
