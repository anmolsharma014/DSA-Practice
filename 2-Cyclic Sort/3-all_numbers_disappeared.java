class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<nums.length) {
            int index = nums[i] - 1;
            if(nums[i] != nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            else {
                i++;
            }
        }
        for(i=0;i<nums.length;i++) {
            if(nums[i] != i+1) {
                list.add(i+1);
            }
        }
        return list;
    }
}
// Leetcode Problem: Missing Number
// Approach: Use cyclic sort to place each number x at index x-1, then scan the array; any index where nums[i] != i+1 represents a missing number.
// Time Complexity:  O(n)
// Space Complexity: O(1)
