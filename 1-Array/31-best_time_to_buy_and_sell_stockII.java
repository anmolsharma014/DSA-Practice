class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
// Leetcode Problem: Best Time to Buy and Sell Stock II
// Approach: Buy before every price increase and add that increase to the total profit.
// Time Complexity:  O(n)
// Space Complexity: O(1)
