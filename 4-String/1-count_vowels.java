class Solution {
  public static int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> {
                    count++;
                }
            }
        }
        return count;
    }
}
// Problem Statement: Find the total number of vowels present in the string.
// Time Complexity: O(n)
// Space Complexity: O(1)
