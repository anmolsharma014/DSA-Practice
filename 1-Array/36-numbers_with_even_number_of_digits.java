class Solution {
    public boolean numberHasEvenDigits(int num) {
        int count = 1;
        while (num > 9) {
            num = num / 10;
            count++;
        }
        return (count % 2 == 0);
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean res = numberHasEvenDigits(nums[i]);
            if (res)
                count++;
        }
        return count;
    }
}
// Leetcode Problem: Find Numbers with Even Number of Digits
// Approach: Traverse the array, count the digits of each number using division by 10, and increment the count if the number has an even number of digits.
// Time Complexity: O(n × d) where n = number of elements and d = maximum number of digits in an element.
// Space Complexity: O(1)
