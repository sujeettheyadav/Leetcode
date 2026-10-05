class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int freq[]=new int[26];
        int maxfreq=0;
        int ans=0;
        for(int j=0;j<s.length();j++){
            freq[s.charAt(j)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(j)-'A']);
            int replacement=(j-i+1)-maxfreq;
            while(replacement>k){
                freq[s.charAt(i)-'A']--;
                i++;
                replacement=(j-i+1)-maxfreq;
            }
            ans=Math.max(ans,j-i+1);
        } 
        return ans;
    }
}