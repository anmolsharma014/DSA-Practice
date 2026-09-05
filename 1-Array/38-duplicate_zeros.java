class Solution {
    public void duplicateZeros(int[] arr) {
        int lastIndex = arr.length - 1;
        int zeroCount = 0;
        for (int i = 0; i <= lastIndex - zeroCount; i++) {
            if (arr[i] == 0) {
                if (i == lastIndex - zeroCount) {
                    arr[lastIndex] = 0;
                    lastIndex--;
                    break;
                }
                zeroCount++;
            }
        }

        int newLastIndex = lastIndex - zeroCount;
        for (int i = newLastIndex; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[lastIndex] = 0;
                lastIndex--;
                arr[lastIndex] = 0;
                lastIndex--;
            } else {
                arr[lastIndex] = arr[i];
                lastIndex--;
            }
        }
    }
}
// Leetcode Problem: Duplicate Zeros
// Approach: Count the zeros that can be duplicated, then traverse the array backward and shift elements while duplicating each zero in-place.
// Time Complexity:  O(n)
// Space Complexity: O(1)
