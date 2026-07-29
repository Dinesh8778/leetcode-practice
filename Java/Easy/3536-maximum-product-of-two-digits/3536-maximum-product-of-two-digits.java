class Solution {
    public int maxProduct(int n) {
        int len = String.valueOf(n).length();
        int[] arr = new int[len];

        for(int i = 0 ; i < len ; i++){
            arr[i] = n%10;
            n/=10;
        }

        int max = 0;

        for(int i = 0 ; i < len ; i++){
            for(int j = i+1 ; j < len ; j++){
                max = Math.max(max , arr[i]*arr[j]);
            }
        }

        return max;
    }
}