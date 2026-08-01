class Solution {
	int countPairs(int arr[], int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int x:arr) {
			int diff = target - x;
			if (map.containsKey(diff)) {
				count += map.get(diff);
			}
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		return count;
	}
}
// GFG Problem: Count pairs with given sum
// Approach: Traverse the array once using a hashmap to store frequencies, and for each element add the count of its complement (target − element) to get total pairs.
// Time Complexity: O(n)
// Space Complexity: O(n)
