class Solution {
    public int numberOfSubstrings(String s, int k) {
        int freq[]=new int[26];
        int ans=0;
        int i=0;
        for(int j=0;j<s.length();j++){
            freq[s.charAt(j)-'a']++;
            while(freq[s.charAt(j)-'a']>=k){
                ans+=s.length()-j;
                freq[s.charAt(i)-'a']--;
                i++;
            }
        }
        return ans;
    }
}