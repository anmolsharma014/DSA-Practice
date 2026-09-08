class Solution {
    Set<Integer> set = new HashSet<>();

    public boolean checkIfExist(int[] arr) {
        for (int x : arr) {
            if (set.contains(x * 2) || (set.contains(x / 2)) && x % 2 == 0)
                return true;
            set.add(x);
        }
        return false;
    }
}
// Leetcode Problem: Check If N and Its Double Exist
// Approach: Use a HashSet to store previous elements and check whether x*2 or an even x/2 already exists.
// Time Complexity:  O(n)
// Space Complexity: O(n)
