class Solution {
	public static char getMaxOccuringChar(String s) {
		Map<Character, Integer> map = new TreeMap<>();
		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		char ch = ' ';
		int max = 0;
		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			if (max < e.getValue()) {
				ch = e.getKey();
				max = e.getValue();
			}
		}
		return ch;
	}
}
// GFG Problem: Most Frequent Character
// Time Complexity: O(n)
// Space Complexity: O(n)
