class Solution {
  public static void frequencyCount(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Key\tFrequency");
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + "\t" + e.getValue());
        }
    }
}
// Problem Statement: Count the frequency of every character present in the string.
// Time Complexity: O(n)
// Space Complexity: O(n)
