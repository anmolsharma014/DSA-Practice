class NumArray {
    private int [] arr;
    public NumArray(int[] nums) {
        for(int i=1;i<nums.length;i++) {
            nums[i] += nums[i-1];
        }
        arr = nums;
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) {
            return arr[right];
        }
        return arr[right] - arr[left-1];
    }
}
// Leetcode Problem: Range Sum Query - Immutable
// Approach: Use prefix sum by replacing each element with the sum of all previous elements, then answer each range query using subtraction.
// Time Complexity:  O(n)
// Space Complexity: O(1)
