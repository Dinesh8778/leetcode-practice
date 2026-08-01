class Solution {
    public int findComplement(int num) {

        int n = num;

        int count = 0;

        while(n != 0){
            n = n >> 1;
            count++;
        }

        long k = (long) Math.pow(2,count) - 1;


        // return(int) num ^ k;
        return Math.toIntExact(num ^ k);
    }
}