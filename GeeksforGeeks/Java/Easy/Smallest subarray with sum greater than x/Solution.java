class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        int l = 0, sum = 0, count = Integer.MAX_VALUE;
        
        for (int r = 0 ; r < arr.length ; r++) {
            sum += arr[r];
            
            while (sum > x && l <= r) {
                count = Math.min(count, r - l + 1);
                sum -= arr[l++];
            }
            
        }
        return (count == Integer.MAX_VALUE) ? 0 : count;
    }
}
