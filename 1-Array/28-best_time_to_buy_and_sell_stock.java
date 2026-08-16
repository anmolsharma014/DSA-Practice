class Solution {
    public int maxProfit(int[] prices) {
        int minCP = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minCP) {
                minCP = prices[i];
            } else {
                max = Math.max(max, prices[i] - minCP);
            }
        }
        return max;
    }
}
// Leetcode Problem: Best Time to Buy and Sell Stock
// Approach: Track the minimum buying price so far and calculate the maximum profit by selling at each current price.
// Time Complexity:  O(n)
// Space Complexity: O(1)
