class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        int i = 1;
        for(int j : arr){
            if(j == k) return i;
            i++;
        }
        return -1;
    }
}