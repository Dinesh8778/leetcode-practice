class Solution {
    void pushZerosToEnd(int[] arr) {
        int ind = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] != 0) {
                arr[ind] = arr[i];
                ind ++;
            }
        }
        
        while (ind < arr.length) {
            arr[ind++] = 0;
        }
    }
}
