class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        result.add(new ArrayList<>());
        for (int num : nums) {
            int n = result.size();
            for (int i = 0; i < n; i++) {
                List<Integer> in = new ArrayList<>(result.get(i));
                in.add(num);
                if (!result.contains(in)) {
                    result.add(in);
                }
            }
        }
        // result.sort(Comparator.comparing(a -> a.get(0)));

        return result;
    }
}