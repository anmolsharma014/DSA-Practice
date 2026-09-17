class Solution {
  public static void countVowelsAndConsonants(String str) {
        int countVowel = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> {
                    countVowel++;
                }
            }
        }
        int countConsonant = str.length() - countVowel;
        String msg = "";
        msg = countVowel > countConsonant ? "YES" : countConsonant > countVowel ? "NO" : "SAME";
        System.out.println(msg);
    }
}

// GFG Problem: Check Consonants and Vowels
// Time Complexity: O(n)
// Space Complexity: O(1)
