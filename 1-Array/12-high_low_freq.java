class Solution {
    public static int[] highLowFreq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
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
        int minKey = 0;
        int minValue = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value < minValue) {
                minValue = value;
                minKey = entry.getKey();
            }
        }
        return new int[]{maxKey,minKey};
    }
}
// Problem: Find the element with highest and lowest frequency. 
// Example: [1,1,1,2,3,3,4,4,4,4,4,5,5,6,6] → 4,2
// Approach: Use a HashMap to count frequencies of elements, then traverse the map to find elements with maximum and minimum frequency. 
// Time Complexity: O(n) 
// Space Complexity: O(n)
