class Solution {
    public int digitFrequencyScore(int n) {
        int ans = 0;
        for(int i = 1; i <= 9; i++){

            int freq = 0;
            for(int j = n; j > 0; j /= 10){
                if(i == (j % 10)) freq++;
            }

            ans += (freq * i);
        }
        return ans;
    }
}