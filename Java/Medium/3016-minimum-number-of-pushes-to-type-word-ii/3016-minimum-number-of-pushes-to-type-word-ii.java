class Solution {
    public int minimumPushes(String word) {
        int freq [] = new int[26];

        for(int i = 0 ; i < word.length() ; i++){
            freq[word.charAt(i) - 'a']++;
        }

        Arrays.sort(freq);

        int ans = 0;
        int count = 0;

        for(int i = 25 ; i >= 0 ; i--){
            if(freq[i] == 0){
                break;
            }
            if(count < 8){
                ans += freq[i];
            } else if(count < 16){
                ans += 2*freq[i];
            } else if(count < 24){
                ans += 3*freq[i];
            } else {
                ans += 4*freq[i];
            }
            count++;
        }

        return ans;
    }
}