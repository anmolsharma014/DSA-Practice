class Solution {
    public int[] countOddEven(int[] arr) {
        int odd = 0 , even = 0;
        for(int x:arr) {
            if(x % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        return new int[]{odd,even};
    }
}
// GFG Problem: Count Odd and Even
// Approach: Traverse the array once and count elements as odd or even using the modulo operator (% 2).
// Time Complexity: O(n)
// Space Complexity: O(1)
