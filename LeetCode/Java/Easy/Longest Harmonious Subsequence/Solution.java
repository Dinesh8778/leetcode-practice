class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        if(map.size() < 2){
            return 0;
        }

        int count = 0;
        int max = 0;

        for(int i : map.keySet()){
            count = map.getOrDefault(i+1,0);
            max = Math.max(max,(map.get(i)+count));
        }

        return max;
    }
}