class Solution {
	public int getSecondLargest(int[] arr) {
		int max = -1;
		int secMax = -1;
		for (int x:arr) {
			if (x>max) {
				secMax = max;
				max = x;
			}
			else if (x != max && x > secMax) {
				secMax = x;
			}
		}
		return secMax;
	}
}
// GFG Problem: Second Largest
// Approach: Traverse the array once while maintaining two variables (max and secMax) to track the largest and second largest distinct elements simultaneously.
// Time Complexity: O(n)
// Space Complexity: O(1)
