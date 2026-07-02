class Solution {
    public int binarysearch(int[] arr, int k) {
        int l = 0, r = arr.length - 1, ans = -1;
        
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] >= k) {
                if (arr[m] == k)
                    ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        
        return ans;
    }
}
