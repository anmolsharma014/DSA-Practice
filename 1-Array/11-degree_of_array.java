class Solution {
    public static int degree(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            if (map.containsKey(x)) {
                int freq = map.get(x);
                freq++;
                map.put(x, freq);
            } else {
                map.put(x, 1);
            }
        }
        int maxKey = 0;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > maxValue) {
                maxValue = value;
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
// Problem: Find the element with maximum frequency (Degree of Array).
// Example: [1,2,2,3,1,2] → 2
// Approach: Count frequency of each element using HashMap, then traverse the map to find the element with highest frequency.
// Time Complexity: O(n)
// Space Complexity: O(n)
