class Solution {
    static int numOfPerfectSquares(int a, int b) {
        
        int start = (int) Math.ceil(Math.sqrt(a));
        int end = (int) Math.floor(Math.sqrt(b));
        
        return end - start + 1;
    }
};
