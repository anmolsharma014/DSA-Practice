class Solution {
  public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int index = arr[i] - 1;
            if (arr[i] != arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            } else {
                i++;
            }
        }
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)
