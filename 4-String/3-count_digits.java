class Solution {
   public static int countDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch))
                count++;
        }
        return count;
    }
}
// Problem Statement: Count number of digits
// Time Complexity: O(n)
// Space Complexity: O(1)
