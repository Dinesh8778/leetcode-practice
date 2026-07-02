class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int sum = 0;
        int l = 0;
        int max = Integer.MIN_VALUE;
        for (int r = 0 ; r < arr.length ; r++) {
            sum += arr[r];
            
            if (r - l + 1 == k) {
                max = Math.max(max, sum);
                sum -= arr[l++];
            }
            
        }
        
        return max;
    }
}
