class Solution {
    public int maxHappiness(List<Integer> arr) {
        
        int sum = 0;
        for (int i = 1; i<arr.size(); i++) {
            int ps = arr.get(i - 1) + arr.get(i);
            sum = Math.max(ps, sum);
        }
        
        return sum;
        
    }
}
