class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int i = 0;
        int[] arr = new int[2];
        while (i < nums.length) {
            int index = nums[i];
            if (nums[i] != nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            } else {
                i++;
            }
        }
        int j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                arr[j] = nums[i];
                j++;
            }
        }
        return arr;
    }
}
// Leetcode Problem: The Two Sneaky Numbers of Digitville
// Approach: Use a cyclic sort
// Time Complexity: O(n)
// Space Complexity: O(1)
