class Solution {
	public boolean checkDuplicates(int arr[]) {
		Set<Integer> set = new HashSet<>();
		for (int x:arr) {
			boolean res = set.add(x);
			if (!res)
				return true;
		}
		return false;
	}
}
// GFG Problem: Check if array contains duplicates
// Approach: Use a HashSet to track elements and return true immediately when an insertion fails (duplicate found).
// Time Complexity: O(n)
// Space Complexity: O(n)
