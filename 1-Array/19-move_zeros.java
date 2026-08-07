class Solution {
    public void moveZeroes(int[] nums) {
       for(int read = 0,write = 0;read<nums.length;read++) {
            if(nums[read] != 0) {
                int temp = nums[write];
                nums[write] = nums[read];
                nums[read] = temp;
                write++;
            }
        }
    }
}
// Leetcode Problem: Move Zeros
// Approach: Traverse the array and swap each non-zero element with the earliest zero position found, pushing all zeros to the end in-place.
// Time Complexity: O(n)
// Space Complexity: O(1)
