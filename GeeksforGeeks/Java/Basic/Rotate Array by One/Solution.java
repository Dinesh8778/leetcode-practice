class Solution {
    public void rotate(int[] arr) {
        int len = arr.length - 1;
        int temp = arr[len];
        
        for (int i = len; i>0; i--) {
            arr[i] = arr[i - 1];
        }
        
        arr[0] = temp;
    }
}
