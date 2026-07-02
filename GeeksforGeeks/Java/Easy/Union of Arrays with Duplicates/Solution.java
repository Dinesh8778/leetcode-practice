class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> ans = new HashSet<>();
        for (int i : a) {
            ans.add(i);
        }
        for (int i : b) {
            ans.add(i);
        }
        ArrayList<Integer> result = new ArrayList<>(ans);
        
        return result;
    }
}
