class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
// Leetcode Problem: Find All Duplicates in an Array
// Approach: Use a cyclic sort
// Time Complexity: O(n)
// Space Complexity: O(n)
