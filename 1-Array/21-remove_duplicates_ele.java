class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(arr[0]);
        for (int i = 1, j = 0; i < arr.length; i++) {
            if (arr[i] != myList.get(j)) {
                myList.add(arr[i]);
                j++;
            }
        }
        return myList;
    }
}
// GFG Problem: Remove Duplicates Sorted Array
// Approach: Traverse the sorted array once and add an element to the list only if it is different from the last added (previous) element.
// Time Complexity: O(n)
// Space Complexity: O(1)
