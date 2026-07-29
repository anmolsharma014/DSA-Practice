class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:nums) {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int maxValue = 0;
        int sum = 0;
        for(int x:map.values()) {
            if(x > maxValue) {
                maxValue = x;
                sum = x;
            }
            else if(x == maxValue) {
                sum += x;
            }
        }
        return sum;
    }
}
// Leetcode Problem: Count Element With Maximum Frequency
// Approach: Count frequency of each element using HashMap, then find the maximum frequency and sum the frequencies of all elements having that maximum frequency.
// Time Complexity: O(n)
// Space Complexity: O(n)
