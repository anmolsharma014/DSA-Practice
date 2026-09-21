class Solution {
  public static int uniqueCharCount(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        return set.size();
    }
}
// GFG Problem: Count the number of unique characters in a given String
// Time Complexity: O(n)
// Space Complexity: O(n)
