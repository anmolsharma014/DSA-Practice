public static int firstUnsorted(int[] arr) {
    for(int i=0;i<arr.length-1;i++) {
        if(arr[i]>arr[i+1]){
            return arr[i+1];
        }
    }
    return -1;
}
// Problem: First unsorted element in a sorted array 
// Example: [2,5,12,9,15]→ 9
// Approach: Traverse the array and return the first element where the current element is greater than the next element.
// Time Complexity: O(n)
// Space Complexity: O(1)
