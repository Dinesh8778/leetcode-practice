class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        boolean [] freq = new boolean[arr.length + 1];
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : arr) {
            if (freq[i])
                result.add(i);
            else
                freq[i] = true;
        }
        return result;
    }
}
