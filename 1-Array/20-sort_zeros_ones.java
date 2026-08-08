class Solution {
	void segregate0and1(int[] arr) {
		for (int write = 0, read = 0; read<arr.length; read++) {
			if (arr[read] != 1) {
				int temp = arr[write];
				arr[write] = arr[read];
				arr[read] = temp;
				write++;
			}
		}
	}
}
// GFG Problem: Segregate 0s and 1s
// Approach: Traverse the array and use two pointers to swap non-1 elements (0s) to the front, keeping all 0s on the left and 1s on the right.
// Time Complexity: O(n)
// Space Complexity: O(1)
